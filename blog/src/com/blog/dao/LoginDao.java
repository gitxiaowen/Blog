package com.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.utils.DBHelper;
import com.blog.utils.Encrypt;

public class LoginDao {

	/**
	 * 根据用户名、邮箱、手机号和密码判断用户是否存在
	 * @param username 用户名
	 * @param password 密码
	 * @return String 返回用户名
	 * @throws Exception 
	 */
	public  static String findUser(String username,String password) throws Exception
	{
		String sql_findID="SELECT uID FROM user WHERE uName=? OR uEmail=? OR uPhone=? AND uPassword=?";
		Object[] args=new Object[4];
		args[0]=username;
		args[1]=username;
		args[2]=username;
		args[3]=Encrypt.Encode(password);
		ResultSet res=DBHelper.Query(sql_findID, args);
		if((res!=null)&&(res.next()))
		{
			String sql_findname="SELECT uName FROM user WHERE uID=?";
			Object[] args_findname=new Object[1];
			args_findname[0]=res.getString("uID");
			ResultSet res_name=DBHelper.Query(sql_findname, args_findname);
			res_name.next();
			return res_name.getString("uName");
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 判断用户表中是否已存在该用户名
	 * @param uName
	 * @return
	 */
	public static boolean isNameExist(String uName){
		
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		String  res=findUser("dolby","blog");
		System.out.println(res);
		
	}
}
