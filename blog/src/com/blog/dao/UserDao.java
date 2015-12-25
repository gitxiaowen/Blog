package com.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.utils.DBHelper;

public class UserDao {
	
	public static int getMaxID() throws SQLException, Exception
	{
		String sql="select max(uID) uID from user";
		ResultSet res=DBHelper.Query(sql);
		if(res.next());
		{
			return res.getInt("uID");
		}
	}
	
	public static int RegUser(String email) throws SQLException, Exception
	{
		String sql="INSERT INTO user (uID,uEmail) values(?,?)";
		Object[] args=new Object[2];
		args[0]=UserDao.getMaxID()+1;
		args[1]=email;
		return DBHelper.NonQuery(sql, args);
	}

}
