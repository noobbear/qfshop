package com.qf.shop.servce.impl;

import java.util.List;

import com.qf.shop.dao.IOrderDetailDao;
import com.qf.shop.dao.impl.OrderDetailImpl;
import com.qf.shop.service.IOrderDetailService;
import com.qf.shop.vo.OrderDetail;

public class OrderDetailServiceImpl implements IOrderDetailService {

	private IOrderDetailDao dao = new OrderDetailImpl();
	
	@Override
	public int addOrder_detail(OrderDetail od) {
		return dao.addOrder_detail(od);
	}

	@Override
	public List<OrderDetail> queryAllOrderList() {
		return dao.queryAllOrderList();
	}

}
