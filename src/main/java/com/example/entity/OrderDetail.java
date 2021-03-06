package com.example.entity;

import java.util.Date;

public class OrderDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goods_date
     *
     * @mbggenerated
     */
    private Date goodsDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.o_orderid
     *
     * @mbggenerated
     */
    private Integer oOrderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goodsid
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goodsname
     *
     * @mbggenerated
     */
    private String goodsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goodsprice
     *
     * @mbggenerated
     */
    private Double goodsprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goods_description
     *
     * @mbggenerated
     */
    private String goodsDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goodsnum
     *
     * @mbggenerated
     */
    private Integer goodsnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goodspic
     *
     * @mbggenerated
     */
    private String goodspic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.goods_total_price
     *
     * @mbggenerated
     */
    private Double goodsTotalPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.id
     *
     * @return the value of t_order_detail.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.id
     *
     * @param id the value for t_order_detail.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goods_date
     *
     * @return the value of t_order_detail.goods_date
     *
     * @mbggenerated
     */
    public Date getGoodsDate() {
        return goodsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goods_date
     *
     * @param goodsDate the value for t_order_detail.goods_date
     *
     * @mbggenerated
     */
    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.o_orderid
     *
     * @return the value of t_order_detail.o_orderid
     *
     * @mbggenerated
     */
    public Integer getoOrderid() {
        return oOrderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.o_orderid
     *
     * @param oOrderid the value for t_order_detail.o_orderid
     *
     * @mbggenerated
     */
    public void setoOrderid(Integer oOrderid) {
        this.oOrderid = oOrderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goodsid
     *
     * @return the value of t_order_detail.goodsid
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goodsid
     *
     * @param goodsid the value for t_order_detail.goodsid
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goodsname
     *
     * @return the value of t_order_detail.goodsname
     *
     * @mbggenerated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goodsname
     *
     * @param goodsname the value for t_order_detail.goodsname
     *
     * @mbggenerated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goodsprice
     *
     * @return the value of t_order_detail.goodsprice
     *
     * @mbggenerated
     */
    public Double getGoodsprice() {
        return goodsprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goodsprice
     *
     * @param goodsprice the value for t_order_detail.goodsprice
     *
     * @mbggenerated
     */
    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goods_description
     *
     * @return the value of t_order_detail.goods_description
     *
     * @mbggenerated
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goods_description
     *
     * @param goodsDescription the value for t_order_detail.goods_description
     *
     * @mbggenerated
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goodsnum
     *
     * @return the value of t_order_detail.goodsnum
     *
     * @mbggenerated
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goodsnum
     *
     * @param goodsnum the value for t_order_detail.goodsnum
     *
     * @mbggenerated
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goodspic
     *
     * @return the value of t_order_detail.goodspic
     *
     * @mbggenerated
     */
    public String getGoodspic() {
        return goodspic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goodspic
     *
     * @param goodspic the value for t_order_detail.goodspic
     *
     * @mbggenerated
     */
    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.goods_total_price
     *
     * @return the value of t_order_detail.goods_total_price
     *
     * @mbggenerated
     */
    public Double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.goods_total_price
     *
     * @param goodsTotalPrice the value for t_order_detail.goods_total_price
     *
     * @mbggenerated
     */
    public void setGoodsTotalPrice(Double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", goodsDate=" + goodsDate + ", oOrderid=" + oOrderid + ", goodsid=" + goodsid
				+ ", goodsname=" + goodsname + ", goodsprice=" + goodsprice + ", goodsDescription=" + goodsDescription
				+ ", goodsnum=" + goodsnum + ", goodspic=" + goodspic + ", goodsTotalPrice=" + goodsTotalPrice + "]";
	}

	public OrderDetail(Integer id, Date goodsDate, Integer oOrderid, Integer goodsid, String goodsname,
			Double goodsprice, String goodsDescription, Integer goodsnum, String goodspic, Double goodsTotalPrice) {
		super();
		this.id = id;
		this.goodsDate = goodsDate;
		this.oOrderid = oOrderid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.goodsDescription = goodsDescription;
		this.goodsnum = goodsnum;
		this.goodspic = goodspic;
		this.goodsTotalPrice = goodsTotalPrice;
	}

	public OrderDetail() {
		super();
	}
}