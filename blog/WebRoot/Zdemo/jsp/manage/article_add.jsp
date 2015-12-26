<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>个人博客——写博客</title>
		<meta name="keywords" content="个人博客模板,博客模板,响应式" />
		<meta name="description" content="如影随形主题的个人博客模板，神秘、俏皮。" />
		<link href="../include/css/base.css" rel="stylesheet"/>
		<link href="../include/css/style.css" rel="stylesheet"/>
		<link href="../include/css/media.css" rel="stylesheet"/>
		<script type="text/javascript" src="../ckeditor/ckeditor.js"></script>
		<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0"/>
		<style type="text/css">
			/*为段落定义样式*/
			input {border:1px solid;border-color:green;}
			span {color:#099;}
		</style>
		<!--[if lt IE 9]>
		<script src="../include/js/modernizr.js"></script>
		<![endif]-->
	</head>
<body>
<div class="ibody">
  <header>
    <h1>如影随形</h1>
    <h2>影子是一个会撒谎的精灵，它在虚空中流浪和等待被发现之间;在存在与不存在之间....</h2>
    <div class="logo"><a href="../manage/article"></a></div>
    <%@ include file="../manage_nav.jsp" %>
    </header>
  <article>
    <h2 class="about_h">您现在的位置是：<a href="../manage/article">首页</a>><a href="1/">写博客</a></h2>
    <div class="index_about">
    <form action="../manage/article_add" method="post" theme="xhtml" enctype="multipart/form-data">
    	<table>
    		<tr>
	    		<td><input name="article.title" style="width:100%;font-size:12pt;text-align:center;" value="请在这里输入标题"/></td>
    		</tr>
    		<tr>
	    		<td><span>文章配图:</span><input type="file" name="some"/></td>
    		</tr>
    		<tr>
    			<td><textarea name="article.content" ></textarea></td>
    			<ckeditor:replace  replace="article.content" basePath="../ckeditor/" />
    		</tr>
    		<tr>
	    		<td>
    				<span>作者:</span><input name="article.editer"  style="width:90px"/>
	    			<span>关键词:</span><input name="article.keywords"  style="width:90px"/>
	    			<span>分类:</span><input name="article.type"  style="width:90px"/>
	    			<span>设为推荐:</span>
	    				<input name="article.notice" type="radio" value="1" />是
		 				<input name="article.notice" type="radio" value="2" checked/>否
	    		</td>
    		</tr>
    	</table>
    </form>
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
   <%@ include file="../copyright.jsp" %> 
  </aside>
  <script src="../include/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
</div>
</body>
</html>
