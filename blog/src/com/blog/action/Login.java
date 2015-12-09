package com.blog.action;

import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.blog.entity.User;
import com.blog.utils.DBHelper;
import com.blog.utils.Encrypt;
import com.blog.service.LoginService;
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
		//验证登录过程，在数据库中查找对应的数据,输入用户名/邮箱/手机号均可验证
		if(LoginService.findUserbyName(getUsername(),getPassword())||LoginService.findUserbyEmail(getUsername(), getPassword())||LoginService.findUserbyPhone(getUsername(), getPassword()))
		{
			//成功登录，将跳转至主界面，同时存储用户信息。
			ActionContext.getContext().getSession().put("user", getUsername());
			System.out.println("登录成功!");
			return SUCCESS;
		}
		else
			return ERROR;
		
	}

}
