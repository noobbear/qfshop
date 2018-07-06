package com.qf.shop.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("EncodingFilter.doFilter()");
//		arg0.setCharacterEncoding("utf-8");
//		arg1.setCharacterEncoding("utf-8");
//		arg2.doFilter(arg0, arg1);
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		MyRequestWrapper wrapper = new MyRequestWrapper(req);
		chain.doFilter(wrapper, response);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}


class MyRequestWrapper extends HttpServletRequestWrapper{

	public MyRequestWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if(value != null){
			if("GET".equals(super.getMethod())){
				try {
					value = new String(value.getBytes("iso-8859-1"), "utf-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}
	

}