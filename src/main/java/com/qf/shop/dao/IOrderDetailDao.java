package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.OrderDetail;

public interface IOrderDetailDao {
	
	int addOrder_detail(OrderDetail od);
	
	List<OrderDetail> queryAllOrderList();
}
