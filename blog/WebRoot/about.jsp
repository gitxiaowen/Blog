<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>关于我们</title>
<script src="../ckeditor/ckeditor.js"></script>
<link href="../res/css/base.css" rel="stylesheet"/>
<link href="../res/css/style.css" rel="stylesheet"/>
<link href="../res/css/media.css" rel="stylesheet"/>
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0"/>
<style type="text/css">
/*为段落定义样式*/
input {border:1px solid;border-color:green;}
span {color:#099;}
</style>
</head>
<body>
<div class="ibody">
<header>
    <h1>竹帛网</h1>
    <h2>新意是一个会撒谎的精灵，它在虚空中流浪和等待被发现之间;在存在与不存在之间....</h2>
    <div><a href="../index.jsp"></a></div>
    <%@ include file="../manage_nav.jsp" %>
    </header>
  <article>
    <h3 class="about_h">您现在的位置是：<a href="../index。jsp">首页</a>><a href="../about.jsp">关于我们</a></h3>
    <div class="about">
      <h2>Just about blog</h2>
      <h2>竹帛网</h2>
      <ul class="blog_a">
        <p>服务器：阿里云
        <p>程  序：原创程序</p>
      </ul>
    </div>
  </article>
  <aside>
   <%@ include file="../infor.jsp" %>
  </aside>
  <script src="../res/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
</div>
</body>
  </body>
</html>
