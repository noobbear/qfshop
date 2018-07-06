package com.qf.shop.dao.impl;

import java.util.List;

import com.qf.shop.dao.IGoodTypeDao;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.GoodType;

public class GoodTypeDaoImpl extends DBUtils<GoodType> implements IGoodTypeDao {

	@Override
	public int addGoodType(GoodType goodType) {
		String sql = "insert into t_goods_type (name,parentId) values(?,?)";
		return commonUpdate(sql, goodType.getName(),goodType.getParentId());
	}

	@Override
	public int updateGoodType(GoodType goodType) {
		String sql = "update t_goods_type set name = ?,parentId = ?  where id = ?";
		return commonUpdate(sql, goodType.getName(),goodType.getParentId(),goodType.getId());
	}

	@Override
	public int deleteGoodType(int id) {
		String sql = "delete from t_goods_type where id = ?";
		return commonUpdate(sql, id);
	}

	@Override
	public List<GoodType> getGoodTypeList() {
		String sql = "select * from t_goods_type ";
		List<GoodType> queryAll = queryAll(sql, GoodType.class, null);
		return queryAll;
	}

	@Override
	public GoodType getGoodTypeById(int id) {
		String sql = "select * from t_goods_type where id = ?";
		List<GoodType> goodsTypeList = queryAll(sql, GoodType.class, id);
		return goodsTypeList == null || goodsTypeList.size() == 0?null:goodsTypeList.get(0);
	}

}
