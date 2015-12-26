package com.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.utils.DBHelper;

public class UserDao {
	
	/**
	 * 查找用户表中的
	 * @return 最大ID
	 * @throws SQLException
	 * @throws Exception
	 */
public static int getMaxID() throws SQLException, Exception
	{
		String sql="select max(uID) uID from user";
		ResultSet res=DBHelper.Query(sql);
		if(res.next());
		{
			return res.getInt("uID");
		}
	}
	/**
	 * 根据邮箱查找用户ID，并进行简单的加密
	 * @param email
	 * @return
	 * @throws Exception
	 */
public String getToken(String email) throws Exception
	{
		int id = 0;
		String sql="select uID from user where uEmail=?";
		Object[] args=new Object[1];
		args[0]=email;
		ResultSet res=DBHelper.Query(sql, args);
		if(res.next())
		{
			id=res.getInt("uID");
		}
		return  Integer.toString(id);
	}
	/**
	 * 通过邮箱注册新用户
	 * @param email
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 */
public static int RegUser(String email) throws SQLException, Exception
	{
		String sql="INSERT INTO user (uID,uEmail) values(?,?)";
		Object[] args=new Object[2];
		args[0]=UserDao.getMaxID()+1;
		args[1]=email;
		return DBHelper.NonQuery(sql, args);
	}

public static String UserNameByID(int uID) throws Exception
	{
		String uName = "";
		String sql="select uName from user where uID=?";
		Object[] args=new Object[1];
		args[0]=uID;
		ResultSet res=DBHelper.Query(sql, args);
		if(res.next())
		{
			uName=res.getString(1);
		}
		return uName;
	}
}
