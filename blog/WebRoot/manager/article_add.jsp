<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑文章</title>
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
<h2 class="about_h">您现在的位置是：<a href="../index.jsp">首页</a>><a href="1/">写博客</a></h2>
 
 <s:form action="article_add" method="post" width="100%" height="100%">
 <table width="100%" height="100%">
           <tr>
	    		<td><input name="aTitle" style="width:100%;font-size:12pt;text-align:center;" value="请在这里输入标题"/></td>
    		</tr> 
 
 <tr>
 <td><textarea  class="ckeditor" name="aContent" id="content">
                            输入文章内容....
         </textarea>
 </td>
  </tr>
  	<td>
    				<span>作者:</span><input name="aAuthor"  style="width:100px"/>
	    			<span>分类:</span><input name="aType"  style="width:100px"/>
                    <input  type=submit value="发表帖子"/>
                    <input  type=reset value="取消发表"/>
       </td>
   </table>
   </s:form>
  
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
        <p>最新推荐</p>
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
          <dt><img src="../res/imgs/s8.jpg"> </dt>
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
  </div>
</body>
</html>