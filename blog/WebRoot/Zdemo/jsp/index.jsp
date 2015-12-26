<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>个人博客——主页</title>
		<meta name="keywords" content="个人博客模板,博客模板,响应式" />
		<meta name="description" content="如影随形主题的个人博客模板，神秘、俏皮。" />
		<link href="../include/css/base.css" rel="stylesheet"/>
		<link href="../include/css/index.css" rel="stylesheet"/>
		<link href="../include/css/style.css" rel="stylesheet"/>
		<link href="../include/css/media.css" rel="stylesheet"/>
		<style type="text/css">
			/*为段落定义样式*/
		</style>
		<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0"/>
		<!--[if lt IE 9]>
		<script src="../include/js/modernizr.js"></script>
		<![endif]-->
	</head>
<body>
<div class="ibody">
  <header>
    <h1>如影随形</h1>
    <h2>影子是一个会撒谎的精灵，它在虚空中流浪和等待被发现之间;在存在与不存在之间....</h2>
    <div class="logo"><a href="#"></a></div>
    <%@ include file="nav.jsp" %>
    </header>
  <article>
    <div class="banner">
      <ul class="texts">
        <p>The best life is use of willing attitude, a happy-go-lucky life. </p>
        <p>最好的生活是用心甘情愿的态度，过随遇而安的生活。</p>
      </ul>
    </div>
    <div class="bloglist">
      <h2>
        <p><span>推荐</span>文章</p>
      </h2>
      <s:iterator value="articles">
	      <div class="blogs">
	        <h3><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></h3>
	        <figure><img src="<s:property value="image"/>" ></figure>
	        <ul>
	        <div class="content" style="height:12em;clear:both;" ><s:property value="content" escape="false"/></div>
	          <a href="../article/article_detail?id=<s:property value="id"/>" target="_blank" class="readmore" style="color:white;">阅读全文&gt;&gt;</a>
	        </ul>
	        <p class="autor"><span>作者：<s:property value="editer"/></span><span>分类：【<a href="/"><s:property value="type"/></a>】</span><span>浏览（<a href="/"><s:property value="count"/></a>）</span><span>评论（<a href="/"><s:property value="count1"/></a>）</span></p>
	        <div class="dateview"><s:property value="time"/></div>
	      </div>
      </s:iterator>
    </div>
    <div class="page">
      	<s:if test="page==1">
      		<a href="#">&lt;</a>
      	</s:if>
      	<s:else>
      		<a href="index?page=<s:property value="page-1"/>">&lt;</a>
      	</s:else>
          <s:iterator begin="1" end="totalPage" var="p">
          	<s:if test="#p==page">
          		<b><s:property/></b>
          	</s:if>
          	<s:else>
          		<a href="index?page=<s:property/>"><s:property/></a>
          	</s:else>
          </s:iterator>
          <s:if test="page==totalPage">
          	<a href="#">&gt;</a>
          </s:if>
          <s:else>
          	<a href="index?page=<s:property value="page+1"/>">&gt;</a>
          </s:else>
      </div>           
  </article>
  <aside>
    <%@ include file="info.jsp" %>
    <div class="tj_news">
      <h2>
        <p class="tj_t1">最新文章</p>
      </h2>
      <ul>
      <s:iterator value="newArticles" >
        <li><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></li>
      </s:iterator>
      </ul>
      <h2>
        <p class="tj_t2">推荐文章</p>
      </h2>
      <ul>
        <s:iterator value="recommendArticles" >
        	<li><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></li>
      	</s:iterator>
      </ul>
    </div>
    <div class="links">
      <h2>
        <p>友情链接</p>
      </h2>
      <ul>
        <li><a href="http://blog_hao.jd-app.com/index/index">个人博客</a></li>
        <li><a href="http://user.qzone.qq.com/657682618">QQ空间</a></li>
      </ul>
    </div>
    <%@ include file="copyright.jsp" %> 
  </aside>
  <script src="../include/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
</div>
</body>
</html>
