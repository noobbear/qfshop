package com.qf.shop.service;

import com.qf.shop.vo.Order;


public interface IOrderService {
	//添加订单
	int addOrder(Order order);
	
	//通过ID查询订单信息
	Order getOrderById(int id);
}
