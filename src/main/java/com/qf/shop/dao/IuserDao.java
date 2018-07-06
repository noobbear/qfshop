package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.User;

public interface IuserDao {
	
	/**
	 * 增加用户
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public List<User> getUserList();
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 用户的登录
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(String name,String password);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User getUserById(String id);
}
