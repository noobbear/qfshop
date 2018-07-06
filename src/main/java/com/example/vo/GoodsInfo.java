package com.example.vo;

import java.math.BigDecimal;

public class GoodsInfo {
	private int id;
	private String goods_name;
	private String goods_description; //商品描述
	private String goods_pic; 
	private double goods_price; // 商品价格
	private int goods_parentid;//所属大类
	private int goods_fatherid;//所属小类
	private int count;//临时变量，方便计算价格
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_description() {
		return goods_description;
	}
	public void setGoods_description(String goods_description) {
		this.goods_description = goods_description;
	}
	public String getGoods_pic() {
		return goods_pic;
	}
	public void setGoods_pic(String goods_pic) {
		this.goods_pic = goods_pic;
	}
	public double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	
	public int getGoods_parentid() {
		return goods_parentid;
	}
	public void setGoods_parentid(int goods_parentid) {
		this.goods_parentid = goods_parentid;
	}
	public int getGoods_fatherid() {
		return goods_fatherid;
	}
	public void setGoods_fatherid(int goods_fatherid) {
		this.goods_fatherid = goods_fatherid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
