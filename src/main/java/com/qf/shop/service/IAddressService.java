package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.Address;

public interface IAddressService {
	// ��ӵ�ַ
	int addAddress(Address address);
	
	// ����id��ѯ��ַ
	List<Address> queryAddressById(int id);
}
