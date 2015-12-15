package com.blog.admin.action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5990593028913305291L;
	private String aName;
	private String aPassword;
	
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	

}
