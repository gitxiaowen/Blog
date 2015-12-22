/**
 * 
 */
package com.blog.entity;

import java.util.Date;

/**
 * 类标识：评论实体类
 * 
 * 创建时间：2015年12月22日19:52:08
 * 
 * @author XiaoWen
 */
public class Comment {

	private int cID;
	private Date cTime;
	private int cArticle;
	private int cUserID;
	private String cContent;
	private String cIP;
	
	public Comment()
	{
		
	}
	
	
	public Comment(int cID, Date cTime, int cArticle, int cUserID, String cContent, String cIP) {
		super();
		this.cID = cID;
		this.cTime = cTime;
		this.cArticle = cArticle;
		this.cUserID = cUserID;
		this.cContent = cContent;
		this.cIP = cIP;
	}

	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public Date getcTime() {
		return cTime;
	}
	public void setcTime(Date cTime) {
		this.cTime = cTime;
	}
	public int getcArticle() {
		return cArticle;
	}
	public void setcArticle(int cArticle) {
		this.cArticle = cArticle;
	}
	public int getcUserID() {
		return cUserID;
	}
	public void setcUserID(int cUserID) {
		this.cUserID = cUserID;
	}
	public String getcContent() {
		return cContent;
	}
	public void setcContent(String cContent) {
		this.cContent = cContent;
	}
	public String getcIP() {
		return cIP;
	}
	public void setcIP(String cIP) {
		this.cIP = cIP;
	}
	
	
}
