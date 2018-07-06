package com.qf.shop.vo;

import java.util.Date;

public class OrderDetail {

	private Integer id;
	private Integer o_orderid;
	private Integer goodsid;
	private String goodsname;
	private double goodsprice;
	private String goods_description;
	private String goodsnum;
	private String goodspic;
	private double goods_total_price;
	private Date goods_date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getO_orderid() {
		return o_orderid;
	}
	public void setO_orderid(Integer o_orderid) {
		this.o_orderid = o_orderid;
	}
	public Integer getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public double getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getGoods_description() {
		return goods_description;
	}
	public void setGoods_description(String goods_description) {
		this.goods_description = goods_description;
	}
	public String getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(String goodsnum) {
		this.goodsnum = goodsnum;
	}
	public String getGoodspic() {
		return goodspic;
	}
	public void setGoodspic(String goodspic) {
		this.goodspic = goodspic;
	}
	public double getGoods_total_price() {
		return goods_total_price;
	}
	public void setGoods_total_price(double goods_total_price) {
		this.goods_total_price = goods_total_price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((goods_description == null) ? 0 : goods_description
						.hashCode());
		long temp;
		temp = Double.doubleToLongBits(goods_total_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((goodsid == null) ? 0 : goodsid.hashCode());
		result = prime * result
				+ ((goodsname == null) ? 0 : goodsname.hashCode());
		result = prime * result
				+ ((goodsnum == null) ? 0 : goodsnum.hashCode());
		result = prime * result
				+ ((goodspic == null) ? 0 : goodspic.hashCode());
		temp = Double.doubleToLongBits(goodsprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((o_orderid == null) ? 0 : o_orderid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetail other = (OrderDetail) obj;
		if (goods_description == null) {
			if (other.goods_description != null)
				return false;
		} else if (!goods_description.equals(other.goods_description))
			return false;
		if (Double.doubleToLongBits(goods_total_price) != Double
				.doubleToLongBits(other.goods_total_price))
			return false;
		if (goodsid == null) {
			if (other.goodsid != null)
				return false;
		} else if (!goodsid.equals(other.goodsid))
			return false;
		if (goodsname == null) {
			if (other.goodsname != null)
				return false;
		} else if (!goodsname.equals(other.goodsname))
			return false;
		if (goodsnum == null) {
			if (other.goodsnum != null)
				return false;
		} else if (!goodsnum.equals(other.goodsnum))
			return false;
		if (goodspic == null) {
			if (other.goodspic != null)
				return false;
		} else if (!goodspic.equals(other.goodspic))
			return false;
		if (Double.doubleToLongBits(goodsprice) != Double
				.doubleToLongBits(other.goodsprice))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (o_orderid == null) {
			if (other.o_orderid != null)
				return false;
		} else if (!o_orderid.equals(other.o_orderid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", o_orderid=" + o_orderid
				+ ", goodsid=" + goodsid + ", goodsname=" + goodsname
				+ ", goodsprice=" + goodsprice + ", goods_description="
				+ goods_description + ", goodsnum=" + goodsnum + ", goodspic="
				+ goodspic + ", goods_total_price=" + goods_total_price + "]";
	}
	public Date getGoods_date() {
		return goods_date;
	}
	public void setGoods_date(Date goods_date) {
		this.goods_date = goods_date;
	}
	
}
;