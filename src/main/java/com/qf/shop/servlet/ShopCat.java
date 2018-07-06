package com.qf.shop.servlet;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.qf.shop.vo.GoodsInfo;

public class ShopCat {

	private List<GoodsInfo> list = new ArrayList<GoodsInfo>();
	private DecimalFormat df = new DecimalFormat();
	public static ShopCat getShopCat(HttpSession session){
		ShopCat shopCat = (ShopCat)session.getAttribute("shop_cat");
		if(shopCat == null){
			shopCat = new ShopCat();
			session.setAttribute("shop_cat",shopCat );
		}
		return shopCat;
	}

	public void add(GoodsInfo goodsInfo) {
		list.add(goodsInfo);
	}
	
	
	public List<GoodsInfo> getList(){
		return list;
	}
	
	public String getTotalPrice(){
		double totalPrice = 0.0;
		for (GoodsInfo goodsInfo : list) {
			double goods_price = goodsInfo.getGoods_price();
			int count = goodsInfo.getCount();
			totalPrice += goods_price*count;
		}
		return df.format(totalPrice);
	}
	
	public void delete(int id){
		for (GoodsInfo goodsInfo : list) {
			if(goodsInfo.getId() == id){
				list.remove(goodsInfo);
				break;
			}
		}
	}
	
}
