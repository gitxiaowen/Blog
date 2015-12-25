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


	public List<Article> allArticle()
	{
		List<Article> listArticle=new  ArrayList<Article>();
		String sql="select * from article order by aPublishDate desc";
		try {
			ResultSet res=DBHelper.Query(sql);
			while(res.next())
			{
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}
