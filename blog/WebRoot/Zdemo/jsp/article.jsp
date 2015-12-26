<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>个人博客——赵浩</title>
		<meta name="keywords" content="个人博客,博客,响应式" />
		<meta name="description" content="如影随形主题的个人博客，神秘、俏皮。" />
		<link href="../include/css/base.css" rel="stylesheet"/>
		<link href="../include/css/style.css" rel="stylesheet"/>
		<link href="../include/css/media.css" rel="stylesheet"/>
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
    <div class="logo"><a href="../index/index"></a></div>
     <%@ include file="nav.jsp" %> 
       </header>
  <article>
    <h2 class="about_h">您现在的位置是：<a href="../index/index">首页</a>><a href="../article/article">慢生活</a></h2>
    <div class="bloglist">
    <s:iterator value="articles">
      <div class="newblog">
        <ul>
          <h3><a href="../article/article_detail?id=<s:property value="id"/>"><s:property value="title"/></a></h3>
          <div class="autor"><span>作者：<a><s:property value="editer"/></a></span><span>分类：[<a href="/"><s:property value="type"/></a>]</span><span>浏览（<a href="/"><s:property value="count"/></a>）</span><span>评论（<a href="/"><s:property value="count1"/></a>）</span>
          <span>
          </span></div>
          <div class="content" style="width:100%"><s:property value="content" escape="false"/></div><a href="../article/article_detail?id=<s:property value="id" />"  class="readmore" style="display:inline-block;">全文</a>
        </ul>
        <figure><img src="<s:property value="image"/>" width="200" height="100" /></figure>
        <div class="dateview"><s:property value="time"/></div>
      </div>
     </s:iterator>
    </div>
		<div class="page">
           	<s:if test="page==1">
           		<a href="#">&lt;</a>
           	</s:if>
           	<s:else>
           		<a href="article?page=<s:property value="page-1"/>">&lt;</a>
           	</s:else>
               <s:iterator begin="1" end="totalPage" var="p">
               	<s:if test="#p==page">
               		<b><s:property/></b>
               	</s:if>
               	<s:else>
               		<a href="article?page=<s:property/>"><s:property/></a>
               	</s:else>
               </s:iterator>
               <s:if test="page==totalPage">
               	<a href="#">&gt;</a>
               </s:if>
               <s:else>
               	<a href="article?page=<s:property value="page+1"/>">&gt;</a>
               </s:else>
           </div>           
  </article>
  <aside>
    <div class="rnav">
      <li class="rnav1 "><a href="#">日记</a></li>
      <li class="rnav2 "><a href="#">欣赏</a></li>
      <li class="rnav3 "><a href="#">程序人生</a></li>
      <li class="rnav4 "><a href="#">经典语录</a></li>
    </div>
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
      <h2>
        <p>最新评论</p>
      </h2>
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
    </div>
   <%@ include file="copyright.jsp" %> 
  </aside>
  <script src="../include/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
</div>
</body>
</html>
