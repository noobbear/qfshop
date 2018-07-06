package com.qf.shop.dao.impl;

import java.util.List;

import com.qf.shop.dao.IGoodsInfoDao;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.GoodsInfo;


public class GoodsInfoDaoImpl extends DBUtils<GoodsInfo> implements IGoodsInfoDao {

	@Override
	public List<GoodsInfo> queryAllGoodsInfo() {
		String sql = "select * from t_goods_info";
		return super.queryAll(sql, GoodsInfo.class,null);
	}

	@Override
	public GoodsInfo getGoodsById(int id) {
		String sql = "select * from t_goods_info where id=?";
		List<GoodsInfo> goodsTypeList = queryAll(sql, GoodsInfo.class, id);
		return goodsTypeList == null || goodsTypeList.size() == 0?null:goodsTypeList.get(0);
	}

	@Override
	public List<GoodsInfo> queryGoodsInfo() {
		String sql = "select * from t_goods_info";
		return super.queryAll(sql, GoodsInfo.class,null);
	}

	@Override
	public int addGoodsInfo(GoodsInfo info) {
		String sql = "insert into t_goods_info(goods_name,goods_description,goods_pic,goods_price,goods_fatherid,goods_parentid)VALUES(?,?,?,?,?,?)";
		return super.commonUpdate(sql, info.getGoods_name(),info.getGoods_description(),info.getGoods_pic(),info.getGoods_price(),info.getGoods_fatherid(),info.getGoods_parentid());
	}

	@Override
	public int updateGoodsInfo(GoodsInfo info) {
		String sql="update t_goods_info set goods_name=?,goods_description=?,goods_price=?,goods_parentid=?,goods_fatherid=?,goods_pic=? where id=?";
		return super.commonUpdate(sql, info.getGoods_name(),info.getGoods_description(),info.getGoods_price(),info.getGoods_parentid(),info.getGoods_fatherid(),info.getGoods_pic(),info.getId());
	}

	@Override
	public int deleteGoodsInfo(int id) {
		String sql = "delete from t_goods_info where id=?";
		return super.commonUpdate(sql, id);
	}

}
