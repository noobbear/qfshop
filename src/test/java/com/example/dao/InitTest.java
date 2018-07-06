package com.example.dao;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.service.UserService;


@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:applicationContext.xml")
public class InitTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testDataSource() {
		System.out.println(dataSource);
	}

}
