package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.GoodsInfo;

public interface IGoodsInfo {
	
	/**
	 * ��ѯ������Ʒ
	 * @return
	 */
	public List<GoodsInfo> getAllGoodsInfo();
	
	/**
	 * ����id��ѯ��Ʒ
	 * @param id
	 * @return
	 */
	public GoodsInfo queryGoodById(int id);
	
	/**
	 * ��ѯ������Ʒ
	 * @return
	 */
	public List<GoodsInfo> queryGoodsInfo();
	
	/**
	 * ������Ʒ
	 * @param info
	 * @return
	 */
	public int addGoodsInfo(GoodsInfo info);
	
	/**
	 * �޸���Ʒ
	 * @param info
	 * @return
	 */
	public int updateGoodsInfo(GoodsInfo info);
	
	/**
	 * ����idɾ����Ʒ
	 * @param id
	 * @return
	 */
	public int deleteGoodsInfo(int id);
}
