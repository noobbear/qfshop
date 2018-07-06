package com.qf.shop.servce.impl;

import java.util.List;

import com.qf.shop.dao.IAddressDao;
import com.qf.shop.dao.impl.AddressDaoImpl;
import com.qf.shop.service.IAddressService;
import com.qf.shop.vo.Address;

public class AddressServiceImpl implements IAddressService{

	private IAddressDao addressDao = new AddressDaoImpl();
	
	@Override
	public int addAddress(Address address) {
		return addressDao.addAddress(address);
	}

	@Override
	public List<Address> queryAddressById(int id) {
		return addressDao.queryAddressById(id);
	}

}
