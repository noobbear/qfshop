package com.example.vo;

public class GoodsInfo {
	private int id;
	private String goodsName;
	private String goodsDescription; //商品描述
	private String goodsPic; 
	private double goodsPrice; // 商品价格
	private int goodsParentid;//所属大类
	private int goodsFatherid;//所属小类
	private int count;//临时变量，方便计算价格
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getGoodsPic() {
		return goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsParentid() {
		return goodsParentid;
	}
	public void setGoodsParentid(int goodsParentid) {
		this.goodsParentid = goodsParentid;
	}
	public int getGoodsFatherid() {
		return goodsFatherid;
	}
	public void setGoodsFatherid(int goodsFatherid) {
		this.goodsFatherid = goodsFatherid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	

}
