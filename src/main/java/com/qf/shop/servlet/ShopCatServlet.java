package com.qf.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.shop.servce.impl.GoodsInfoServiceImpl;
import com.qf.shop.service.IGoodsInfo;
import com.qf.shop.vo.GoodsInfo;

/**
 * Servlet implementation class ShopCatServlet
 */
public class ShopCatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		int id = Integer.parseInt(request.getParameter("id"));
		String count = request.getParameter("count");
		String pay = request.getParameter("pay");
		if("delete".equals(method)){
			ShopCat shopCat = (ShopCat)request.getSession().getAttribute("shop_cat");
			shopCat.delete(id);
			request.getRequestDispatcher("shopcat.jsp").forward(request, response);
		}else if("update".equals(method)){
			ShopCat shopCat = ShopCat.getShopCat(request.getSession());
			String page = "";
			List<GoodsInfo> goodsInfoList = shopCat.getList();
			for (GoodsInfo goodsInfo : goodsInfoList) {
				if(goodsInfo.getId() == id){
					goodsInfo.setCount(Integer.parseInt(count));
				}
			}
			
			if(pay == null || "".equals(pay)){
				page = "shopcat.jsp";
			}else {
				page = "pay.jsp";
			}
			request.getRequestDispatcher(page).forward(request, response);
		}
	}

}
