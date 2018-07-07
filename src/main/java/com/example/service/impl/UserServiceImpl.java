package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IUserDao;
import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDao userDao;
	
	//不推荐使用该方法
	@Override
	public List<User> queryAll() {
		return userDao.queryAll();
	}
	
	@Override
	public PageInfo<User> queryAll(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userDao.queryAll();
		return new PageInfo<>(list);
	}

	@Override
	public User login(User user) {
		if (user==null||user.getName()==null||user.getPassword()==null||user.getName().trim().equals("")||user.getPassword().trim().equals("")) {
			return null;
		}
		return userDao.login(user);
	}
}
