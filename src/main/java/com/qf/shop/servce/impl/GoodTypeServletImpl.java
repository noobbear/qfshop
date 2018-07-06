package com.qf.shop.servce.impl;

import java.util.List;

import com.qf.shop.dao.IGoodTypeDao;
import com.qf.shop.dao.impl.GoodTypeDaoImpl;
import com.qf.shop.service.IGoodTypeService;
import com.qf.shop.vo.GoodType;

public class GoodTypeServletImpl  implements IGoodTypeService{
	
	private IGoodTypeDao dao = new GoodTypeDaoImpl();
	
	@Override
	public int addGoodType(GoodType goodType) {
		return dao.addGoodType(goodType);
	}

	@Override
	public int updateGoodType(GoodType goodType) {
		return dao.updateGoodType(goodType);
	}

	@Override
	public int deleteGoodType(int id) {
		return dao.deleteGoodType(id);
	}

	@Override
	public List<GoodType> getGoodTypeList() {
		return dao.getGoodTypeList();
	}

	@Override
	public GoodType getGoodTypeById(int id) {
		return dao.getGoodTypeById(id);
	}

}
