<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:directive.page import="com.blog.dao.*"/>
    <%
    	int  aID=0;
    	ArticleDao ad=new ArticleDao();
    	String[] article=ad.getArticlebyID(aID);
    	String aTitle=article[0];
    	String aContent=article[1];
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link rel="stylesheet" href="/blog/res/css/markdown.css" type="text/css">
<link rel="stylesheet" href="/blog/res/css/article.css" type="text/css">
<title>这里插入文章标题好了</title>
</head>
<body>
<!--navbar部分-->
<a class="logo"><img alt="" src="" width="45" height="45" ></a>
<center><h2><%=aTitle%></h2></center>
<div class="aContent"><%=aContent%>
</div>
</body>
</html>