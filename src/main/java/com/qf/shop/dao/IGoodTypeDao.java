package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.GoodType;

public interface IGoodTypeDao {
	
	/**
	 * ������Ʒ����
	 * @param goodType
	 * @return
	 */
	public int addGoodType(GoodType goodType);
	
	/**
	 * �޸���Ʒ����
	 * @param goodType
	 * @return
	 */
	public int updateGoodType(GoodType goodType);
	
	/**
	 * ����Idɾ����Ʒ����
	 */
	public int deleteGoodType(int id);
	
	/**
	 * ��ѯ���е���Ʒ����
	 * @return
	 */
	public List<GoodType> getGoodTypeList();
	
	/**
	 * ����id��ѯ��Ʒ����
	 * @param id
	 * @return
	 */
	public GoodType getGoodTypeById(int id);
}
