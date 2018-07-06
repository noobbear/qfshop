package com.qf.shop.dao;

import java.util.List;

import com.qf.shop.vo.User;

public interface IuserDao {
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * ����idɾ���û�
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * ��ѯ���е��û�
	 * @return
	 */
	public List<User> getUserList();
	
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * �û��ĵ�¼
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(String name,String password);
	
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return
	 */
	public User getUserById(String id);
}
