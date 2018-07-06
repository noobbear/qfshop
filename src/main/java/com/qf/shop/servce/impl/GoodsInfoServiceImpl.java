package com.qf.shop.servce.impl;

import java.util.List;

import com.qf.shop.dao.IGoodsInfoDao;
import com.qf.shop.dao.impl.GoodsInfoDaoImpl;
import com.qf.shop.service.IGoodsInfo;
import com.qf.shop.vo.GoodsInfo;


public class GoodsInfoServiceImpl implements IGoodsInfo {
	IGoodsInfoDao giDao = new GoodsInfoDaoImpl();
	
	@Override
	public List<GoodsInfo> getAllGoodsInfo(){
		return giDao.queryAllGoodsInfo();
	}
	
	@Override
	public GoodsInfo queryGoodById(int id){
		return giDao.getGoodsById(id);
	}
	
	@Override
	public List<GoodsInfo> queryGoodsInfo(){
		return giDao.queryGoodsInfo();
	}
	
	@Override
	public int addGoodsInfo(GoodsInfo info){
		return giDao.addGoodsInfo(info);
	}
	
	@Override
	public int updateGoodsInfo(GoodsInfo info){
		return giDao.updateGoodsInfo(info);
	}
	
	@Override
	public int deleteGoodsInfo(int id){
		return giDao.deleteGoodsInfo(id);
	}
}
