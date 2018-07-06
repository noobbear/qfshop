package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.GoodsInfo;

public interface IGoodsInfo {
	
	/**
	 * 查询所有商品
	 * @return
	 */
	public List<GoodsInfo> getAllGoodsInfo();
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	public GoodsInfo queryGoodById(int id);
	
	/**
	 * 查询所有商品
	 * @return
	 */
	public List<GoodsInfo> queryGoodsInfo();
	
	/**
	 * 增加商品
	 * @param info
	 * @return
	 */
	public int addGoodsInfo(GoodsInfo info);
	
	/**
	 * 修改商品
	 * @param info
	 * @return
	 */
	public int updateGoodsInfo(GoodsInfo info);
	
	/**
	 * 根据id删除商品
	 * @param id
	 * @return
	 */
	public int deleteGoodsInfo(int id);
}
