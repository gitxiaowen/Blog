package com.blog.action;

import com.opensymphony.xwork2.ActionSupport;

public class JsonDemo extends ActionSupport {
	
	private String uName;
	
	
	private String msg;
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String execute() throws Exception {
		msg="hello dolby";
		// TODO Auto-generated method stub
		return SUCCESS;
	}	
	public String getMsg()
	{
		return msg;
	}
	

}
