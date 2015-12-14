package com.blog.action;


import com.blog.dao.LoginDao;
import com.blog.entity.User;
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
public class Login extends ActionSupport implements ModelDriven<User>{
	
	private User user=new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
//	private String username;
//	private String password;
//	
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}

//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//验证登录过程，在数据库中查找对应的数据,输入用户名/邮箱/手机号均可验证
		System.out.println(getModel().getuName());
//		String user=LoginService.findUser(getUsername(), getPassword());
//		if(user!=null)
//		{
//			//成功登录，将跳转至主界面，同时存储用户信息。
//			ActionContext.getContext().getSession().put("user", user);
//			System.out.println("登录成功!");
//			return SUCCESS;
//		}
//		else
//			return ERROR;
//		
		return "success";
	}

@Override
public User getModel() {
	// TODO Auto-generated method stub
	return user;
}

}
