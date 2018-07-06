package com.qf.shop.service;

import java.util.List;
import java.util.Map;

import com.qf.shop.vo.Order;
import com.qf.shop.vo.OrderDetail;

public interface IOrderDetailService {
	
	int addOrder_detail(OrderDetail od);
	
	List<OrderDetail> queryAllOrderList();
}
