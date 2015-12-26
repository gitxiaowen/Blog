package com.blog.dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.blog.entity.*;
import com.blog.utils.DBHelper;

/**
 * 类标识：文章相关的数据操作类
 * 
 * 创建时间：2015年12月22日17:04:13
 * 
 * @author XiaoWen
 *
 */
public class ArticleDao {

	
	public static void main(String[] args) {
		ArticleDao ad=new ArticleDao();
		List<Article> list=ad.allArticle();
	}
	/**
	 * 查找所有的文章
	 * @return 返回所有查找到的文章
	 */
	public List<Article> allArticle()
	{
		List<Article> listArticle=new  ArrayList<Article>();
		String sql="select * from article order by aPublishDate desc";
		try {
			ResultSet res=DBHelper.Query(sql);
			while(res.next())
			{
				Article a=new Article();
				a.setaID(res.getInt(1));
				a.setaTitle(res.getString(2));
				a.setaContent(res.getString(3));
				a.setaPublishDate(res.getDate(4));
				a.setAuthor(res.getInt(5));
				a.setaType(res.getInt(6));
				a.setaView(res.getInt(7));
				a.setaUpvotes(res.getInt(8));
				a.setaDownVotes(res.getInt(9));
				listArticle.add(a);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listArticle;
	}
	
	/**
	 * 根据标签查找文章
	 * @param tagID
	 * @return
	 */
	public List<Article> articlesByTag(int tagID)
	{
		List<Article> listArticle=new  ArrayList<Article>();
		String sql="select * from article where aType=? order by aPublishDate desc";
		Object[] args=new Object[1];
		args[0]=tagID;
		try {
			ResultSet res=DBHelper.Query(sql);
			while(res.next())
			{
				Article a=new Article();
				a.setaID(res.getInt(0));
				a.setaTitle(res.getString(1));
				a.setaContent(res.getString(2));
				a.setaPublishDate(res.getDate(3));
				a.setAuthor(res.getInt(4));
				a.setaType(res.getInt(5));
				a.setaView(res.getInt(6));
				a.setaUpvotes(res.getInt(7));
				a.setaDownVotes(res.getInt(8));
				listArticle.add(a);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listArticle;
	}
	
	public static int getMaxID() throws Exception
	{
		int id = 0;
		String sql="select max(aID) aID from article";
		ResultSet res=DBHelper.Query(sql);
		if(res.next())
		{
			id=res.getInt("aID");
		}
		return id;
	}
	
	public int addArticle(String title, String content, int author, int type) throws Exception
	{
		String sql="insert into article (aID,aTitle,aContent,aAuthor,aType) values(?,?,?,?,?)";
		Object[] args=new Object[5];
		args[0]=ArticleDao.getMaxID();
		args[1]=title;
		args[2]=content;
		args[3]=author;
		args[4]=type;
		return DBHelper.NonQuery(sql, args);
	}
} 
