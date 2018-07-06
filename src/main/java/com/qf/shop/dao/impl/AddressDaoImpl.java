package com.qf.shop.dao.impl;

import java.util.List;

import com.qf.shop.dao.IAddressDao;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.Address;

public class AddressDaoImpl  extends DBUtils<Address> implements IAddressDao {

	@Override
	public int addAddress(Address address) {
		String sql = "insert into t_address (shouhuoren,phone,address,userid,isdefault) values(?,?,?,?,?)";
		return DBUtils.commonUpdate(sql,address.getShouhuoren(),address.getPhone(),address.getAddress(),address.getUserid(),address.getIsdefault());
	}

	@Override
	public List<Address> queryAddressById(int id) {
		String sql = "select * from t_address where userid = ?";
		return queryAll(sql,Address.class,id);
	}

}
