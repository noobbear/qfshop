package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.Address;


public interface IAddressDao {
	// ��ӵ�ַ
	int addAddress(Address address);
	
	// ����id��ѯ��ַ
	List<Address> queryAddressById(int id);
}
