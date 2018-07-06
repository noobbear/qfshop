package com.qf.shop.dao;

import com.qf.shop.vo.Order;


public interface IOrderDao {
	//添加订单
	int addOrder(Order order);
	
	//通过ID查询订单信息
	Order getOrderById(int id);
}
