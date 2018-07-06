package com.qf.shop.dao.impl;

import java.util.List;

import com.qf.shop.dao.IOrderDao;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.Order;



public class OrderDaoImpl extends DBUtils<Order> implements IOrderDao {

	@Override
	public int addOrder(Order o) {
		String sql = "INSERT INTO t_order(id,o_sendtype,o_paytype,o_paycount,o_orderdate,userid,o_shperson,o_shphone,o_shaddress)VALUES(?,?,?,?,?,?,?,?,?)";
		return super.commonUpdate(sql, o.getId(),o.getO_sendtype(),o.getO_paytype(),o.getO_paycount(),o.getO_orderdate(),o.getUserid(),o.getO_shperson(),o.getO_shphone(),o.getO_shaddress());
	}

	@Override
	public Order getOrderById(int id) {
		String sql = "select * from t_order where id=?";
		List<Order> orderLis = queryAll(sql, Order.class, id);
		if(orderLis != null && orderLis.size() > 0){
			return orderLis.get(0);
		}
		return null;
	}

}
