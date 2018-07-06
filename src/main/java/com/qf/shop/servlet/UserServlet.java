package com.qf.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qf.shop.servce.impl.UserServiceImpl;
import com.qf.shop.service.IUserService;
import com.qf.shop.vo.User;


public class UserServlet extends HttpServlet {


	private IUserService userService =new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("UserServlet.doGet()");
		doPost(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String method = req.getParameter("method");
		System.out.println("UserServlet.doPost() ==== "+method);
		if("login".equals(method)){
			System.out.println("登录操作");
			String username = req.getParameter("name");
			String password = req.getParameter("password");
			System.out.println("userName:"+username);
			System.out.println("password:"+password);
			User user = userService.login(username, password);
			if(user == null){
				resp.getWriter().write("<script>alert('用户不存在');location.href='backLogin.jsp'</script>");;
			}else{
				if("是".equals(user.getIsAdmin())){
					req.getSession().setAttribute("sessionUser", user);
					req.getRequestDispatcher("/back/main.jsp").forward(req, resp);;
				}else{
					resp.getWriter().write("<script>alert('sorry,你不是管理员');location.href='backLogin.jsp'</script>");;
				}
			}
		}else if("getUserList".equals(method)){
			getAllUserList(req, resp);
		}else if("add".equals(method)){
			String username = req.getParameter("name");
			String role = req.getParameter("isAdmin");
			String password = req.getParameter("password");
			String sex = req.getParameter("sex");
			User user = new User();
			user.setName(username);
			user.setPassword(password);
			user.setSex(sex);
			user.setIsAdmin(role);
			int result = userService.add(user);
			if(result > 0){
				getAllUserList(req, resp);
			}else{
				resp.getWriter().write("<script>alert('添加用户失败！请重新填写！');location.href='back/user/adduser.jsp'</script>");
			}
		}else if("findUserById".equals(method)){
			String userId = req.getParameter("userId");
			System.out.println("update:"+userId);
			User user = userService.getUserById(userId);
			req.setAttribute("user", user);
			req.getRequestDispatcher("/back/user/updateuser.jsp").forward(req, resp);
		}else if("update".equals(method)){
			String id = req.getParameter("id");
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String role = req.getParameter("isAdmin");
			String sex = req.getParameter("sex");
			User user = new User();
			user.setIsAdmin(role);
			user.setName(username);
			user.setPassword(password);
			user.setSex(sex);
			user.setId(Integer.parseInt(id));
			int reuslt = userService.update(user);
			if(reuslt > 0){
				getAllUserList(req, resp);
			}else{
				req.setAttribute("user", user);
				req.getRequestDispatcher("/back/user/updateuser.jsp").forward(req, resp);
			}
			
		}else if("delete".equals(method)){
			String id = req.getParameter("userId");
			int result = userService.delete(Integer.parseInt(id));
			if(result > 0){
				getAllUserList(req, resp);
			}else {
				resp.getWriter().write("<script>alert('删除失败');location.href='userServlet?method=getUserList'</script>");
			}
		}else if("Frontlogin".equals(method)){
			String username = req.getParameter("name");
			String password = req.getParameter("password");
			User user = userService.login(username, password);
			if(user == null){
				resp.getWriter().write("<script>alert('用户不存在');location.href='login.jsp'</script>");;
			}else{
				req.getSession().setAttribute("sessionUser", user);
				req.getRequestDispatcher("home.jsp").forward(req, resp);;
			}
		}else if("logout".equals(method)){
			HttpSession session = req.getSession();
			session.setAttribute("sessionUser", null);
			session.setAttribute("shop_cat", null);
			req.getRequestDispatcher("GoodsInfoServlet?method=queryAll").forward(req, resp);;
		}
	}

	private void getAllUserList(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<User> userList = userService.getUserList();
		req.setAttribute("userList", userList);
		req.getRequestDispatcher("../back/user/userinfo.jsp").forward(req, resp);;
	}
}
