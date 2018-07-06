package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.Address;


public interface IAddressDao {
	// 添加地址
	int addAddress(Address address);
	
	// 根据id查询地址
	List<Address> queryAddressById(int id);
}
