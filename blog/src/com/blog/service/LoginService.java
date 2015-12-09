package com.blog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.utils.DBHelper;
import com.blog.utils.Encrypt;

public class LoginService {

	/**
	 * 根据用户名和密码判断用户是否存在
	 * @param username 用户名
	 * @param password 密码
	 * @return boolean
	 * @throws Exception 
	 */
	public  static boolean findUserbyName(String username,String password) throws Exception
	{
		String sql="SELECT uID FROM user WHERE uName=? AND uPassword=?";
		Object[] args=new Object[2];
		args[0]=username;
		args[1]=Encrypt.Encode(password);
		ResultSet res=DBHelper.Query(sql, args);
		if((res!=null)&&(res.next()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * 根据邮箱和密码判断用户是否存在
	 * @param email
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	public static boolean findUserbyEmail(String email,String password) throws Exception
	{
		String sql="SELECT uID FROM user WHERE uEmail=? AND uPassword=?";
		Object[] args=new Object[2];
		args[0]=email;
		args[1]=Encrypt.Encode(password);
		ResultSet res=DBHelper.Query(sql, args);
		if((res!=null)&&(res.next()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * 根据手机号和密码判断用户是否存在
	 * @param phone
	 * @param password
	 * @return
	 * @throws Exception 数据库操作异常
	 */
	public  static boolean findUserbyPhone(String phone,String password) throws Exception
	{
		String sql="SELECT uID FROM user WHERE uPhone=? AND uPassword=?";
		Object[] args=new Object[2];
		args[0]=phone;
		args[1]=Encrypt.Encode(password);
		ResultSet res=DBHelper.Query(sql, args);
		if((res!=null)&&(res.next()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
