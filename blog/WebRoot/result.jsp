<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:directive.page import="com.blog.dao.*"/>
<jsp:directive.page import="com.blog.entity.*"/>
<jsp:directive.page import="java.util.List"/>
<%
	String tagName=(String)request.getAttribute("tagName");
	ArticleDao ad=new ArticleDao();
	List<Article> list=ad.searchByTagName(tagName);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索列表</title>
<link rel="stylesheet" type="text/css" href="./res/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="./res/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="./res/css/index.css">
<link rel="stylesheet" type="text/css" href="/blog/res/css/result.css">
<script src="./res/js/jquery-1.11.2.min.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
<!-- 主题文章部分 -->
<ul class="articles">

<% for(int i=0;i<list.size();i++)
	{
	out.print("<li class=\"article\"><div class=\"a-top\"><a class=\"profile\"></a>");
	out.print("<a class=\"author\">");
	out.print(UserDao.UserNameByID(list.get(i).getAuthor()));
	out.print("</a><a class=\"tag\">");
	out.print(ad.tNamebyID(list.get(i).getaType()));
	out.print("</a><a class=\"publishtime\">");
	out.print(list.get(i).getaPublishDate().toString());
	out.print(" ·</a><a class=\"readcount\">");
	out.print(list.get(i).getaView()+"人已阅</a>");
	out.print("<h2>"+list.get(i).getaTitle()+"</h2>");
	out.print("<div class=\"content\" href=\"#\">");
	out.print(list.get(i).getaContent()+"</div>");
	out.print("</div></li>");
	}%>
	</ul>
</div>
</body>
</html>