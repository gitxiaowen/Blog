<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>留言板</title>
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
     <h2 class="about_h">您现在的位置是：<a href="../index.jsp">首页</a>><a href="../comment">留言板</a></h2>
  <div class="template">
    <h3>
        <p><span>随便说说</span></p>
    </h3>
     <ul class="pl_n">
       <s:iterator value="comment" >
        <dl>
          <dt><img src="../res/imgs/s8.jpg"> </dt>
          <dt> </dt>
          <dd><s:property value="cUserID"/>
            <time><s:property value="cTime"/></time>
          </dd>
          <dd><a href="#"><s:property value="cContent" escape="false"/></a></dd>
        </dl>
        </s:iterator>
      </ul>
      <!--《《《《《《《差个分页的》》》》》》》》》  -->
    <%-- <div class="pagesize">
      	<s:if test="pagesize==1">
      		<a href="#">&lt;</a>
      	</s:if>
      	<s:else>
      		<a href="comment?pagesize=<s:property value="pagesize-1"/>">&lt;</a>
      	</s:else>
          <s:iterator begin="1" end="totalPage" var="p">
          	<s:if test="#p==totalpage">
          		<b><s:property/></b>
          	</s:if>
          	<s:else>
          		<a href="comment?totalpage=<s:property/>"><s:property/></a>
          	</s:else>
          </s:iterator>
          <s:if test="page==totalPage">
          	<a href="#">&gt;</a>
          </s:if>
          <s:else>
          	<a href="critique?page=<s:property value="page+1"/>">&gt;</a>
          </s:else>
      </div>  --%>
  
  <h3>
        <p><span>随便说说</span></p>
        <a href="#" target="_blank" class="more"></a>
      </h3>
       <s:form action="comment" method="post" >
      		<table>
      			<tr>
      				<td><span>您的姓名:</span></td><td><input name="cUserID"/></td>
      			</tr>
      			<tr>
	    			<td><div style="width:70px;padding-bottom: 189px;"><span>留言内容:</span></div></td>
	    			<td><textarea name="cContent" style ="height:200px; width:630px;" ></textarea></td>
    			</tr>
    			<tr>
	    			<td></td><td><button type="submit" style="width: 60px;height: 30px;font-size: larger;">提交</button></td>
    			</tr>
      		</table>
      </s:form> 
  </div>
 </article>
 
   <aside>
    <div class="rnav">
      <li class="rnav1 "><a href="http://blog_hao.jd-app.com/index/index">个人博客</a></li>
      <li class="rnav2 "><a href="http://user.qzone.qq.com/657682618">QQ空间</a></li>
      <li class="rnav3 "><a href="#">个人作品</a></li>
      <li class="rnav4 "><a href="#">随便逛逛</a></li>
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
    <%@ include file="../copyright.jsp" %> 
  </aside>
  <script src="../include/js/silder.js"></script>
  <div class="clear"></div>
  <!-- 清除浮动 --> 
  </div>
  </body>
</html>
