package com.blog.entity;
import java.sql.Date;
/**
 * 类标识：文章实体类
 * 
 * 创建时间：2015年12月22日19:42:17
 * 
 * @author XiaoWen
 *
 */

public class Article {
	
	private int aID;
	private String aTitle;
	private String aContent;
	private Date aPublishDate;
	private int Author;
	private int aType;
	private int aView;
	private int aUpvotes;
	private int aDownVotes;
	private String aIP;
	
	
	public int getaID() {
		return aID;
	}

	public void setaID(int aID) {
		this.aID = aID;
	}

	public String getaTitle() {
		return aTitle;
	}

	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}

	public String getaContent() {
		return aContent;
	}

	public void setaContent(String aContent) {
		this.aContent = aContent;
	}

	public Date getaPublishDate() {
		return aPublishDate;
	}

	public void setaPublishDate(Date aPublishDate) {
		this.aPublishDate = aPublishDate;
	}

	public int getAuthor() {
		return Author;
	}

	public void setAuthor(int author) {
		Author = author;
	}

	public int getaType() {
		return aType;
	}

	public void setaType(int aType) {
		this.aType = aType;
	}

	public int getaView() {
		return aView;
	}

	public void setaView(int aView) {
		this.aView = aView;
	}

	public int getaUpvotes() {
		return aUpvotes;
	}

	public void setaUpvotes(int aUpvotes) {
		this.aUpvotes = aUpvotes;
	}

	public int getaDownVotes() {
		return aDownVotes;
	}

	public void setaDownVotes(int aDownVotes) {
		this.aDownVotes = aDownVotes;
	}

	public String getaIP() {
		return aIP;
	}

	public void setaIP(String aIP) {
		this.aIP = aIP;
	}

	public Article()
	{
		
	}
	


	public Article(int aID, String aTitle, String aContent, Date aPublishDate, int author, int aType, int aView,
			int aUpvotes, int aDownVotes, String aIP) {
		super();
		this.aID = aID;
		this.aTitle = aTitle;
		this.aContent = aContent;
		this.aPublishDate = aPublishDate;
		Author = author;
		this.aType = aType;
		this.aView = aView;
		this.aUpvotes = aUpvotes;
		this.aDownVotes = aDownVotes;
		this.aIP = aIP;
	}

	
}
