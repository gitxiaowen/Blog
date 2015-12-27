package com.blog.action;


import java.util.Map;

import com.blog.dao.LoginDao;
import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.utils.Email;
import com.blog.utils.Encrypt;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



/*******************************************
 * 	创建标识： 熊小文   2015.10.14
 * 
 * 	类描述：登录操作类
 * 
 * 	修改内容：
 * 	修改时间：
 * 	修改原因：
 *******************************************/
public class LoginAction extends ActionSupport {
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//根据邮箱该用户已注册过还是新用户
		LoginDao ld=new LoginDao();
		System.out.println(getEmail());
		//如果为新用户，发送创建账户的邮件，并插入数据库中
		if(!LoginDao.isNewUser(getEmail()))
		{//发送邮件
			//注册此账户
			UserDao ud=new UserDao();
			ud.RegUser(getEmail());	
			String token="";
			token=Encrypt.Encode(ud.getToken(getEmail()));	
			Email.sendMail(getEmail(), Email.getMessage("http://localhost/blog/callbackAction?token="+token));
			System.out.println(token);
		}
		else
		{
		}
		return "success";
	}

	

}
