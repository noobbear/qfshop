package com.qf.shop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.qf.shop.dao.IuserDao;
import com.qf.shop.util.DBManager;
import com.qf.shop.util.DBUtils;
import com.qf.shop.vo.User;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

public class UserDaoImpl extends DBUtils<User> implements IuserDao {

	@Override
	public int add(User user) {
		String sql = "insert into t_user (name,password,sex,isAdmin) values(?,?,?,?)";
		return DBUtils.commonUpdate(sql, user.getName(), user.getPassword(), user.getSex(), user.getIsAdmin());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from t_user where id = ?";
		return DBUtils.commonUpdate(sql, id);
	}

	@Override
	public List<User> getUserList() {
		String sql = "select * from t_user";
		return queryAll(sql, User.class, null);
	}

	@Override
	public int update(User user) {
		String sql = "update t_user set name=?, password=?,sex=?,isAdmin = ? where id=? ";
		return commonUpdate(sql, user.getName(), user.getPassword(), user.getSex(), user.getIsAdmin(), user.getId());
	}

	@Override
	public User login(String name, String password) {
		String sql = "select * from t_user where name = ? and password = ? ";
		List<User> queryAll = queryAll(sql, User.class, name, password);
		return queryAll == null || queryAll.size() == 0 ? null : queryAll.get(0);
	}

	@Override
	public User getUserById(String id) {
		String sql = "select * from t_user where id = ?";
		List<User> queryAll = queryAll(sql, User.class, id);
		return queryAll == null || queryAll.size() == 0 ? null : queryAll.get(0);
	}
}
