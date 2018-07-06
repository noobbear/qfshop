package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.GoodType;

public interface IGoodTypeService {
	
	/**
	 * �����Ʒ����
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
	 * ɾ����Ʒ����
	 * @param id
	 * @return
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
