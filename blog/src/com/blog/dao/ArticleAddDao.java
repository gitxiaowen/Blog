/**
 * @编写人:赵张承; 
 * @时间 :下午4:38:38;
 * @日期 :2015年12月26日;
 * 更改原因:
 */ 
package com.blog.dao;

import com.blog.entity.Article;
import com.blog.utils.DBHelper;

/**
 *类描述：添加文章对数据库的操作
 *@author: blank
 *@date： 日期：2015年12月26日 时间：下午4:38:38
 *@version 1.0
 */
public class ArticleAddDao {
	private DBHelper connection=null;
	private Article  article=null;
	public ArticleAddDao(Article form){
		connection=new DBHelper();
		String sql=null;
		sql="insert into article (aTitle,aContent,aAuthor,aType)values ('"+ form.getaTitle() + "','" + form.getaContent() + "','"
					+ form.getAuthor() + "','"+form.getaType()+"')";		
		
		
		
	}

}
