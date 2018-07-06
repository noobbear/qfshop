package com.example.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class UserDaoTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testQueryAll() {
		PageHelper.startPage(1, 10);
		List<User> list = userService.queryAll();
		PageInfo<User> infos = new PageInfo<>(list);
		System.out.println(infos.toString());
	}
}
