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
	 * ���õ�һ�����²���
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
	 * ���õ�һ����ѯ����
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
			// ��ȡԪ���ݶ���,ResultSet ����ĳ��������Ϣ��һ����ѯ�Ľ��,ResultSetMetaData �й� ResultSet ���е����ƺ����͵���Ϣ��
			md = rs.getMetaData();
			// ��ȡ��¼���ֶ���
			int columnCount = md.getColumnCount();
			// �������е�������
			while(rs.next())
			{
				T ins = cls.newInstance();
				// ����һ�������е����е���
				for (int i = 1; i <= columnCount; i++) {
					String columnName = md.getColumnName(i);
					Object values = rs.getObject(i);
					try{
						Field field = cls.getDeclaredField(columnName);
						// Ҫ��˽�����Խ��в�����������Ȩ
						field.setAccessible(true);
						field.set(ins, values);
				
					}catch(NoSuchFieldException e){
						System.out.println(columnName+"�ֶβ�����");
					}catch (IllegalArgumentException e) {
						System.out.println(columnName+"�ֶ����Ͳ�ƥ��");
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