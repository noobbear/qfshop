package com.example.dao;

import com.example.entity.GoodType;

public interface GoodTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    int insert(GoodType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    int insertSelective(GoodType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    GoodType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodType record);
}