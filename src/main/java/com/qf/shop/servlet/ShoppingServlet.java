package com.qf.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.shop.servce.impl.AddressServiceImpl;
import com.qf.shop.servce.impl.GoodsInfoServiceImpl;
import com.qf.shop.service.IAddressService;
import com.qf.shop.service.IGoodsInfo;
import com.qf.shop.vo.Address;
import com.qf.shop.vo.GoodsInfo;
import com.qf.shop.vo.User;

/**
 * Servlet implementation class ShoppingServlet
 */
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private IGoodsInfo goodsInfoServlet = new GoodsInfoServiceImpl();
	private IAddressService addressService = new AddressServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingServlet() {
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
		String id = request.getParameter("id");
		String count = request.getParameter("count");
		String key = request.getParameter("key");
		String page = "";
		KeyOpetion keyObject = KeyOpetion.getKeyObject();
		if(keyObject.keyContains(key)){
			GoodsInfo goodsInfo = goodsInfoServlet.queryGoodById(Integer.parseInt(id));
			ShopCat shopCat = ShopCat.getShopCat(request.getSession());
			goodsInfo.setCount(Integer.parseInt(count));
			shopCat.add(goodsInfo);
			System.out.println("getList:"+shopCat.getList());
			User user = (User) request.getSession().getAttribute("sessionUser");
			if(user == null){
				response.getWriter().write("<script>alert('您还未登录，请先登录再进行支付！');location.href='login.jsp'</script>");
				return ;
			}
			if("paynow".equals(method)){
				keyObject.deleteKey(key);
				page = "pay.jsp";
				getAddressList(request);
			}else if("gotoShopping".equals(method)){
				keyObject.deleteKey(key);
				page = "shopcat.jsp";
						
			}
		}else{
			if("paynow".equals(method)){
				getAddressList(request);
				page = "pay.jsp";
			}else if("gotoShopping".equals(method)){
				page = "shopcat.jsp";
			}
		}
		request.getRequestDispatcher(page).forward(request, response);	
	}
	
	public void getAddressList(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("sessionUser");
		List<Address> addressList = addressService.queryAddressById(user.getId());
		request.setAttribute("addressList",addressList);
	}
}
