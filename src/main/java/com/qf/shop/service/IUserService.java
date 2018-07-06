package com.qf.shop.service;

import java.util.List;

import com.qf.shop.vo.User;

public interface IUserService {
	
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * ɾ���û�
	 * @param id
	 * @return
	 */
	public int delete(int id);
	
	/**
	 * ��ѯ�����û�
	 * @return
	 */
	public List<User> getUserList();
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public int update(User user);
	/**
	 * ��¼
	 * @param name
	 * @param password
	 * @return
	 */
	public User login(String name,String password);
	
	/**
	 * ע��
	 * @return
	 */
	public int register(User user);
	
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return
	 */
	public User getUserById(String id);
	
}
