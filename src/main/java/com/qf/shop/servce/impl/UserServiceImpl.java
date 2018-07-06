package com.qf.shop.servce.impl;

import java.util.List;

import com.qf.shop.dao.impl.UserDaoImpl;
import com.qf.shop.service.IUserService;
import com.qf.shop.dao.IuserDao;
import com.qf.shop.vo.User;

public class UserServiceImpl implements IUserService {

	private IuserDao userDao = new UserDaoImpl();
	
	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int delete(int id) {
		return userDao.delete(id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int update(User user) {
		return userDao.update(user);
	}

	@Override
	public User login(String name, String password) {
		return userDao.login(name, password);
	}

	@Override
	public int register(User user) {
		return userDao.add(user);
	}

	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}

}
