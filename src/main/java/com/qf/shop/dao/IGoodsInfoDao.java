package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.GoodsInfo;


public interface IGoodsInfoDao {
	
	/**
	 * 查询所有商品
	 * @return
	 */
	List<GoodsInfo> queryAllGoodsInfo();
	
	/**
	 * 根据Id查询商品
	 * @param id
	 * @return
	 */
	GoodsInfo getGoodsById(int id);
	
	/**
	 * 查询所有的商品
	 * @return
	 */
	List<GoodsInfo> queryGoodsInfo();
	
	/**
	 * 增加商品
	 * @param info
	 * @return
	 */
	int addGoodsInfo(GoodsInfo info);
	
	/**
	 * 修改商品
	 * @param info
	 * @return
	 */
	int updateGoodsInfo(GoodsInfo info);
	
	/**
	 * 删除商品
	 * @param id
	 * @return
	 */
	int deleteGoodsInfo(int id);
}
