package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.User;

public interface IUserService {
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> getUserList();
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int update(User user);
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(String name,String password);
	
	/**
	 * 注册
	 * @return
	 */
	public int register(User user);
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 */
	public User getUserById(String id);
	
}
