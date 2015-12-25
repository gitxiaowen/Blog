package com.blog.entity;

import java.io.Serializable;
import java.util.List;
/**
 * 类标识：文章实体和评论实体的分页类
 * 
 * 创建时间：2015年12月22日17:01:31
 * 
 * @author XiaoWen
 *
 */


public class Pager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1548081326895288476L;
	private int pageSize;
	private int curPage;
	private int totalRecord;
	private int totalPage;
	private List<Object> dataList;

	/**
	 * 空的构造函数
	 */
	public Pager()
	{
		super();
	}
	/**
	 * 根据当前页码、页码大小以及所有列表新建Pager类
	 * @param pageNum 页码
	 * @param pageSize 页面大小
	 * @param listArticle 所有的文章数据
	 */
	public Pager(int pageNum, int pageSize,List<Object> listObject)
	{
		if(listObject==null)
		{
			return;
		}
		this.totalRecord=listObject.size();
		this.pageSize=pageSize;
		this.totalPage=this.totalRecord/this.pageSize;
		if(this.totalRecord%this.pageSize!=0)
		{
			this.totalPage+=1;
		}
		if(this.totalPage<pageNum)
		{
			this.curPage=this.totalPage;
		}
		else
		{
			this.curPage=pageNum;
		}
		int from=this.pageSize*(this.curPage-1);
		int end;
		if(this.pageSize*this.curPage>this.totalRecord)
		{
			end=this.totalRecord;
		}
		else
		{
			end=this.pageSize*this.curPage;
		}
		this.dataList=listObject.subList(from, end);
	}
	
	/**
	 * 全参的构造函数
	 * @param pageSize
	 * @param curPage
	 * @param totalRecord
	 * @param totalPage
	 * @param dataList
	 */
	public Pager(int pageSize, int curPage, int totalRecord, int totalPage, List<Object> objectList) {
		super();
		this.pageSize = pageSize;
		this.curPage = curPage;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.dataList = objectList;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Object> getDataList() {
		return dataList;
	}
	public void setDataList(List<Object> objectList) {
		this.dataList = objectList;
	}
	
	
	
	
}
