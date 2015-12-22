package com.blog.entity;
/**
 * 类描述：消息实体类
 * 
 * 创建时间：2015年12月22日19:46:36
 * 
 * @author XiaoWen
 *
 */

public class Msg {

	private int mID;
	private int mReceiver;
	private String mTitle;
	private String mContent;
	
	public Msg()
	{
		
	}

	public int getmID() {
		return mID;
	}

	public void setmID(int mID) {
		this.mID = mID;
	}

	public int getmReceiver() {
		return mReceiver;
	}

	public void setmReceiver(int mReceiver) {
		this.mReceiver = mReceiver;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public Msg(int mID, int mReceiver, String mTitle, String mContent) {
		super();
		this.mID = mID;
		this.mReceiver = mReceiver;
		this.mTitle = mTitle;
		this.mContent = mContent;
	}
	
	
}
