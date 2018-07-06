package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.GoodType;

public interface IGoodTypeService {
	
	/**
	 * 添加商品类型
	 * @param goodType
	 * @return
	 */
	public int addGoodType(GoodType goodType);
	
	/**
	 * 修改商品类型
	 * @param goodType
	 * @return
	 */
	public int updateGoodType(GoodType goodType);
	
	/**
	 * 删除商品类型
	 * @param id
	 * @return
	 */
	public int deleteGoodType(int id);
	
	/**
	 * 查询所有的商品类型
	 * @return
	 */
	public List<GoodType> getGoodTypeList();
	
	/**
	 * 根据id查询商品类型
	 * @param id
	 * @return
	 */
	public GoodType getGoodTypeById(int id);
	
}
