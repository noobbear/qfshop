package com.example.service;

import java.util.List;

import com.example.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
	
	public List<User> queryAll();

	PageInfo<User> queryAll(Integer pageNum, Integer pageSize);

	public User login(User user);
}
