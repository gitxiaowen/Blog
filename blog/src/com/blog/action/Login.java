package com.blog.action;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.entity.User;
import com.blog.utils.DBHelper;
import com.blog.utils.Encrypt;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



/*******************************************
 * 	创建标识： 熊小文   2015.10.14
 * 
 * 	类描述：登录操作类
 * 
 * 	修改内容：
 * 	修改时间：
 * 	修改原因：
 *******************************************/
public class Login extends ActionSupport {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//验证登录过程，在数据库中查找对应的数据
		String sql="SELECT uID FROM user WHERE uName=? AND uPassword=?";
		Object[] args=new Object[2];
		args[0]=getUsername();
		args[1]=Encrypt.Encode(getPassword());
		ResultSet res=DBHelper.Query(sql, args);
		if(res.next())
		{
			System.out.println("登录成功!");
			return SUCCESS;
		}
		else
			return ERROR;
		
	}

}
