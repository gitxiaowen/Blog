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

	
	public static void main(String[] args) throws Exception {
		ArticleDao ad=new ArticleDao();
		List<Article> list=ad.searchByTagName("云");
		System.out.println(list.size());
	}
	
	public String[] getArticlebyID(int aID) throws Exception
	{
		String[] article=new String[2];
		String sql="select aTitle,aContent from article where aID=?";
		Object[] args=new Object[1];
		args[0]=aID;
		ResultSet res=DBHelper.Query(sql, args);
		if(res.next())
		{
			article[0]=res.getString(1);
			article[1]=res.getString(2);
		}
		return article;
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
	 * 根据便签ID查找名称
	 * @param tagID
	 * @return
	 * @throws Exception 
	 */
	public String tNamebyID(int tagID) throws Exception
	{
		String tName = "";
		String sql="select tName from articletype where tID=?";
		Object[] args=new Object[1];
		args[0]=tagID;
		ResultSet res=DBHelper.Query(sql, args);
		if(res.next())
		{
			 tName=res.getString(1);
		}
		return tName;
	}
	
	/**
	 * 根据标签名进行模糊查找
	 * @param tagname
	 * @return
	 * @throws Exception
	 */
	public List<Article> searchByTagName(String tagname) throws Exception
	{
		List<Article> listArticle =new ArrayList<Article>();
		String sql="SELECT * FROM v_allarticle WHERE tName LIKE CONCAT('%',?,'%')";
		Object[] args=new Object[1];
		args[0]=tagname;
		ResultSet res=DBHelper.Query(sql, args);
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
		return listArticle;
	}
} 
