<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>首页</title>
<link href="./res/css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./res/css/index.css">
<script src="./res/js/jquery-1.11.2.min.js" type="text/javascript"></script>
<script src="./res/js/index.js" type="text/javascript"></script>
</head>

<body>

<!--navbar部分-->
<div class="nav">
<div class="nav-left">
<ul class="nav-list">
  <li class="nav-item"><a href="#" class="logo">Whut Blog</a></li>
  <li class="nav-item"><a href="#" class="picked">精选文章</a></li>
  <li class="nav-item"><a href="#" class="hot">热门文章</a></li>
  <li class="nav-item"><a href="#" class="tags">文章标签</a></li>
</ul>
</div>
<div class="nav-right">
<div class="search">
<a><img class="search-btn" src="res/imgs/search-default.png"></a>
<input placeholder="搜索文章">
</div>
  <a class="write" href="./user/EditArticle.jsp">提笔</a>
  <a href="./login.jsp" class="login-reg">登录/注册</a>
</div>
</div>

<!-- 包裹在container中 -->
<div class="container">
<!-- 主题文章部分 -->
<ul class="articles">
  <li class="article">
	<div class="a-top">
		<a class="profile"></a>
		<a class="author">我是作者</a><a class="tag">父标签</a>
		<a class="publishtime">五天前 ·</a><a class="readcount">8w人已阅</a>
		<h2>这是文章的标题！</h2>
		<a class="content">我都说了这是文章的内容，你就不要再乱搞了！</a>
	</div>
  </li>
  <li class="article">
  
  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
  <li class="article">

  This is Passage!</li>
</ul>



<!-- 侧边栏部分 -->
<div class="sidebar">
  <div class="sidebar-container">
    <div class="tags"></div>
    <div class="footer">
      <a href="">帮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;助</a>
      <a href="">开源项目</a>
      <a href="">隐私条款</a>
      <a href="aboutus.html">关于我们</a>
    </div>
  </div>


</div>
</div>
</body>
</html>
