<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
    	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1,text/html; charset=utf-8"/> 
        <link rel="shortcut icon" href="../favicon.ico"/> 
		<title>个人博客——照片管理</title>
		<meta name="keywords" content="个人博客模板,博客模板,响应式" />
		<meta name="description" content="如影随形主题的个人博客模板，神秘、俏皮。" />
		<link href="../include/css/base.css" rel="stylesheet"/>
		<link href="../include/css/style.css" rel="stylesheet"/>
		<link href="../include/css/media.css" rel="stylesheet"/>
		<script type="text/javascript" src="../include/js/jquery.min.js"></script>
		<script type="text/javascript" src="../include/js/jquery.gallery.js"></script>
		<script type="text/javascript" src="../include/js/modernizr.custom.53451.js"></script>
		<meta name="viewport" content="width=device-width, minimum-scale=1.0,initial-scale=1.0,maximum-scale=1.0"/>
		<!--[if lt IE 9]>
		<script src="../include/js/modernizr.js"></script>
		<![endif]-->
	</head>
<body>
<div class="ibody">
  <header>
    <h1>如影随形</h1>
    <h2>影子是一个会撒谎的精灵，它在虚空中流浪和等待被发现之间;在存在与不存在之间....</h2>
    <div class="logo"><a href="../manage/article""></a></div>
    <%@ include file="../manage_nav.jsp" %>
     </header>
  <article>
    <h2 class="about_h">您现在的位置是：<a href="../manage/article">首页</a>><a href="../manage/album">相册管理</a>><a href="#">照片管理</a></h2>
    <div class="template">
      <h3>
        <p><span>个人相册</span></p>
        <a href="../manage/to_album_photo_add?albumId=<s:property value="id" />"  class="more">添加照片</a> </h3>
      </h3>
      <ul>
      <s:iterator value="photos">
        <li><img src="<s:property value="image" />"/></a><span><s:property value="note"/><a href="../manage/album_photo_delete?id=<s:property value="id" />">删除</a></span></li>
      </s:iterator>
      </ul>
      <h3>
        <p><span>最新评论</span></p>
      </h3>
      <ul class="pl_n">
       <s:iterator value="critiques" >
        <dl>
          <dt><img src="../include/images/s8.jpg"> </dt>
          <dt> </dt>
          <dd><s:property value="name"/>
            <time><s:property value="time"/></time>
          </dd>
          <dd><a href="#"><s:property value="content" escape="false"/></a></dd>
        </dl>
        </s:iterator>
      </ul>
      
   <div class="page">
           	<s:if test="page==1">
           		<a href="#">&lt;</a>
           	</s:if>
           	<s:else>
           		<a href="album_detail?page=<s:property value="page-1"/>&id=<s:property value="id"/>">&lt;</a>
           	</s:else>
               <s:iterator begin="1" end="totalPage" var="p">
               	<s:if test="#p==page">
               		<b><s:property/></b>
               	</s:if>
               	<s:else>
               		<a href="album_detail?page=<s:property/>&id=<s:property value="id"/>"><s:property/></a>
               	</s:else>
               </s:iterator>
               <s:if test="page==totalPage">
               	<a href="#">&gt;</a>
               </s:if>
               <s:else>
               	<a href="album_detail?page=<s:property value="page+1"/>&id=<s:property value="id"/>">&gt;</a>
               </s:else>
           </div>           
   </article>
  <aside>
    <%@ include file="../rnav.jsp" %> 
    <div class="ph_news">
      <h2>
        <p>点击排行</p>
      </h2>
      <ul class="ph_n">
        <s:iterator value="hotArticles" status="index">
      	<s:if test="#index.index<3">
       		<li><span class="num1"><s:property value="#index.index+1"/></span><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></li>
       	</s:if>
       	<s:else>
       		<li><span><s:property value="#index.index+1"/></span><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></li>
       	</s:else>
       </s:iterator>
      </ul>
      <h2>
        <p>栏目推荐</p>
      </h2>
      <ul>
        <s:iterator value="recommendArticles" >
        	<li><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></li>
      	</s:iterator>
      </ul>
    <%@ include file="../copyright.jsp" %> 
  </aside>
  <script src="../include/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
</div>
</body>
</html>
