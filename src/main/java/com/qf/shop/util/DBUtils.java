package com.qf.shop.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBUtils<T> {

	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	private ResultSetMetaData md = null;
	
	/**
	 * 共用的一个更新操作
	 * @param sql
	 * @param parames
	 * @return
	 */
	public static int commonUpdate(String sql,Object ... parames){
		int result = 0;
		conn = DBManager.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < parames.length; i++) {
				ps.setObject(i+1, parames[i]);
			}
			result =ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBManager.close(conn, ps, rs);
		}
		return result;
	}


	/**
	 * 共用的一个查询操作
	 * @param sql
	 * @param cls
	 * @param obj
	 * @return
	 */
	public List<T> queryAll(String sql,Class<T> cls,Object ... obj)
	{
		List<T> list = new ArrayList<T>();
		try {
			conn = DBManager.getConnection();
			ps = conn.prepareStatement(sql);
			if(obj != null)
			{
				for (int i = 0; i < obj.length; i++) {
					ps.setObject(i+1, obj[i]);
				}
			}
			rs = ps.executeQuery();
			// 获取元数据对象,ResultSet 关于某个表的信息或一个查询的结果,ResultSetMetaData 有关 ResultSet 中列的名称和类型的信息。
			md = rs.getMetaData();
			// 获取记录的字段数
			int columnCount = md.getColumnCount();
			// 遍历所有的数据行
			while(rs.next())
			{
				T ins = cls.newInstance();
				// 遍历一行数据中的所有的列
				for (int i = 1; i <= columnCount; i++) {
					String columnName = md.getColumnName(i);
					Object values = rs.getObject(i);
					try{
						Field field = cls.getDeclaredField(columnName);
						// 要对私有属性进行操作，必须授权
						field.setAccessible(true);
						field.set(ins, values);
				
					}catch(NoSuchFieldException e){
						System.out.println(columnName+"字段不存在");
					}catch (IllegalArgumentException e) {
						System.out.println(columnName+"字段类型不匹配");
					}
				}
				list.add(ins);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (SecurityException e) {
			e.printStackTrace();
		}finally{
			DBManager.close(conn, ps, rs);
		}
		return list;
	}
	
}
