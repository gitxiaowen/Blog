package com.blog.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class PublishArticle extends ActionSupport {

	 private HttpServletRequest request;
	 
	 
	
	@Override
	public String execute() throws Exception {
		 request = ServletActionContext.getRequest();
		// TODO Auto-generated method stub	
		System.out.println(request.getAttribute("aTitle"));
		return SUCCESS;
	}



	public HttpServletRequest getRequest() {
		return request;
	}



	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	
	





	

	
	
	
}
