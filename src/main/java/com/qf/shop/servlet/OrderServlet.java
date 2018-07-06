package com.qf.shop.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.shop.servce.impl.OrderServiceImpl;
import com.qf.shop.servce.impl.OrderDetailServiceImpl;
import com.qf.shop.service.IOrderService;
import com.qf.shop.service.IOrderDetailService;
import com.qf.shop.vo.GoodsInfo;
import com.qf.shop.vo.Order;
import com.qf.shop.vo.OrderDetail;
import com.qf.shop.vo.User;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private IOrderService orderService = new OrderServiceImpl();
	private IOrderDetailService orderDetailService = new OrderDetailServiceImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getParameter("method");
		SimpleDateFormat format = new SimpleDateFormat("yyyyssSSS");
		if("add".equals(method)){
			User user = (User) req.getSession().getAttribute("sessionUser");
			ShopCat shopCar = ShopCat.getShopCat(req.getSession());
			List<GoodsInfo> list = shopCar.getList();
			String shouhuoren = req.getParameter("shouhuoren");
			String phone = req.getParameter("phone");
			String address = req.getParameter("address");
			String express = req.getParameter("express"); // 快递公司
			String bank = req.getParameter("bank"); // 支付方式
			String paycount = shopCar.getTotalPrice(); // 总价
			
			
			Date date = new Date();
			String orderid = format.format(date);
			
			// 保存订单
			Order order = new Order();
			order.setId(Integer.parseInt(orderid));
			order.setO_sendtype(express);
			order.setO_paytype(bank);
			order.setO_paycount(paycount);
			order.setO_orderdate(new Date());
			order.setUserid(user.getId());
			order.setO_shperson(shouhuoren);
			order.setO_shphone(phone);
			order.setO_shaddress(address);
			orderService.addOrder(order);
			
			// 订单详情
			for (GoodsInfo goodsInfo : list) {
				OrderDetail oDetail = new OrderDetail();
				oDetail.setGoodsid(goodsInfo.getId());
				oDetail.setO_orderid(Integer.parseInt(orderid));
				oDetail.setGoodsname(goodsInfo.getGoods_name());
				oDetail.setGoodspic(goodsInfo.getGoods_pic());
				oDetail.setGoodsprice(goodsInfo.getGoods_price());
				oDetail.setGoods_description(goodsInfo.getGoods_description());
				oDetail.setGoodsnum(String.valueOf(goodsInfo.getCount()));
				oDetail.setGoods_total_price(goodsInfo.getGoods_price()*goodsInfo.getCount());
				oDetail.setGoods_date(new Date());
				orderDetailService.addOrder_detail(oDetail);
			}
			req.getRequestDispatcher("/success.jsp").forward(req, resp);
		}else if("getOrderDetailList".equals(method)){
			List<OrderDetail> orderDetailList = orderDetailService.queryAllOrderList();
			req.setAttribute("orderDetailList", orderDetailList);
			req.getRequestDispatcher("/back/order/orderlist.jsp").forward(req, resp);
		}
	}

}
