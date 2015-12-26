/**
 * @编写人:赵张承; 
 * @时间 :下午3:10:37;
 * @日期 :2015年12月26日;
 * 更改原因:
 */ 
package com.blog.action;

import com.blog.dao.ArticleDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 *类描述：文章添加action实现
 *@author: blank
 *@date： 日期：2015年12月26日 时间：下午3:10:37
 *@version 1.0
 */
public class ArticleAddAction extends ActionSupport{
	
	private String aTitle;
	private String aContent;
	private int aAuthor;
	private int aType;
	
	
	public String execute() throws Exception{
		System.out.println("进入articleadd action");
		ArticleDao ad=new ArticleDao();
		int res=ad.addArticle(getaTitle(), getaContent(), getaAuthor(), getaType());
		if(res>=0)
		{
			return "success";
		}
		else
			return "error";
		}


	public String getaTitle() {
		return aTitle;
	}


	public String getaContent() {
		return aContent;
	}


	public int getaAuthor() {
		return aAuthor;
	}


	public int getaType() {
		return aType;
	}


	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}


	public void setaContent(String aContent) {
		this.aContent = aContent;
	}


	public void setaAuthor(int aAuthor) {
		this.aAuthor = aAuthor;
	}


	public void setaType(int aType) {
		this.aType = aType;
	}

}
