package com.blog.entity;

import java.util.Date;

/**
 * 类标识：反馈实体类
 * 
 * 创建时间：2015年12月22日19:49:10
 * 
 * @author XiaoWen
 *
 */
public class Feedback {

	private int fID;
	private int fUser;
	private Date fDate;
	private String fContent;
	private byte[] fAttach;
	
	public int getfID() {
		return fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public int getfUser() {
		return fUser;
	}

	public void setfUser(int fUser) {
		this.fUser = fUser;
	}

	public Date getfDate() {
		return fDate;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}

	public String getfContent() {
		return fContent;
	}

	public void setfContent(String fContent) {
		this.fContent = fContent;
	}

	public byte[] getfAttach() {
		return fAttach;
	}

	public void setfAttach(byte[] fAttach) {
		this.fAttach = fAttach;
	}

	public Feedback(int fID, int fUser, Date fDate, String fContent, byte[] fAttach) {
		super();
		this.fID = fID;
		this.fUser = fUser;
		this.fDate = fDate;
		this.fContent = fContent;
		this.fAttach = fAttach;
	}
	
	
	
}
