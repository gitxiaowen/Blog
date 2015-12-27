package com.blog.action;

import com.opensymphony.xwork2.ActionSupport;

public class PublishArticle extends ActionSupport {

	private String aContent;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getaContent());
		return SUCCESS;
	}



	
	public String getaContent() {
		return aContent;
	}
	public void setaContent(String aContent) {
		this.aContent = aContent;
	}
	
	
	
	
}
