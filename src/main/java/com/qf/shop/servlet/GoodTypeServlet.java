package com.qf.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.shop.servce.impl.GoodTypeServletImpl;
import com.qf.shop.service.IGoodTypeService;
import com.qf.shop.vo.GoodType;

/**
 * Servlet implementation class GoodTypeServlet
 */
public class GoodTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IGoodTypeService goodTypeService = new GoodTypeServletImpl(); 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getParameter("method");
		System.out.println("method:"+method);
		if("add".equals(method)){
			String typeName = req.getParameter("name");
			String typeParentId = req.getParameter("parentId");
			GoodType goodType = new GoodType();
			goodType.setName(typeName);
			goodType.setParentId(Integer.parseInt(typeParentId));
			int result = goodTypeService.addGoodType(goodType);
			if(result > 0) { // 代表添加成功
				getGoodsTypeList(req, resp);
			}else{
				List<GoodType> goodTypeList = goodTypeService.getGoodTypeList();
				req.setAttribute("goodTypeList", goodTypeList);
				resp.getWriter().write("<script>alert('添加失败');location.href='back/goodstype/goodsadd.jsp'</script>");
			}
		}else if("getGoodTypeList".equals(method)){
			getGoodsTypeList(req, resp);
		}else if("queryParentType".equals(method)){
			List<GoodType> goodTypeList = goodTypeService.getGoodTypeList();
			req.setAttribute("goodTypeList", goodTypeList);
			req.getRequestDispatcher("back/goodstype/goodsadd.jsp").forward(req, resp);
		}else if("update".equals(method)){
			String typeName = req.getParameter("name");
			String id = req.getParameter("id");
			String typeParentId = req.getParameter("parentId");
			GoodType goodType = new GoodType();
			goodType.setName(typeName);
			goodType.setId(Integer.parseInt(id));
			goodType.setParentId(Integer.parseInt(typeParentId));
			int result = goodTypeService.updateGoodType(goodType);
			if(result > 0){
				getGoodsTypeList(req, resp);
			}else {
				req.setAttribute("goodsType", goodType);
				resp.getWriter().write("<script>alert('添加失败');location.href='back/goodstype/goodstypeupdate.jsp'</script>");
			}
		}else if("findGoodsTypeById".equals(method)){
			String goodsTypeId = req.getParameter("id");
			GoodType goodsType = goodTypeService.getGoodTypeById(Integer.parseInt(goodsTypeId));
			List<GoodType> goodTypeList = goodTypeService.getGoodTypeList();
			req.setAttribute("goodTypeList", goodTypeList);
			req.setAttribute("goodsType", goodsType);
			req.getRequestDispatcher("/back/goodstype/goodstypeupdate.jsp").forward(req, resp);
		}else if("delete".equals(method)){
			String id = req.getParameter("id");
			System.out.println("delete:"+id);
			int result = goodTypeService.deleteGoodType(Integer.parseInt(id));
			if(result > 0){
				getGoodsTypeList(req,resp);
			}
		}
	}

	private void getGoodsTypeList(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<GoodType> goodTypeList = goodTypeService.getGoodTypeList();
		req.setAttribute("goodTypeList", goodTypeList);
		System.out.println("getGoodTypeList:"+goodTypeList);
		req.getRequestDispatcher("back/goodstype/goodstype.jsp").forward(req, resp);
	}

}
