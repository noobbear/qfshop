package com.qf.shop.dao.impl;

import java.util.List;

import com.qf.shop.dao.IOrderDetailDao;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.OrderDetail;


public class OrderDetailImpl extends DBUtils<OrderDetail> implements IOrderDetailDao {

	@Override
	public int addOrder_detail(OrderDetail od) {
		String sql = "INSERT into t_order_detail(o_orderid,goodsid,goodsname,goodsprice,goods_description,goodsnum,goodspic,goods_total_price,goods_date)VALUES(?,?,?,?,?,?,?,?,?)";
		return super.commonUpdate(sql, od.getO_orderid(),od.getGoodsid(),od.getGoodsname(),od.getGoodsprice(),od.getGoods_description(),od.getGoodsnum(),od.getGoodspic(),od.getGoods_total_price(),od.getGoods_date());
	}

	@Override
	public List<OrderDetail> queryAllOrderList() {
		String sql = "select * from t_order_detail";
		return queryAll(sql, OrderDetail.class, null);
	}

}
