package com.qf.shop.servce.impl;

import com.qf.shop.dao.IOrderDao;
import com.qf.shop.dao.impl.OrderDaoImpl;
import com.qf.shop.service.IOrderService;
import com.qf.shop.vo.Order;

public class OrderServiceImpl implements IOrderService {

	private IOrderDao dao = new OrderDaoImpl();
	
	@Override
	public int addOrder(Order order) {
		return dao.addOrder(order);
	}

	@Override
	public Order getOrderById(int id) {
		return dao.getOrderById(id);
	}

}
