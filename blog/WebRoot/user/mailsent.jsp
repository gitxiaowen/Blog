<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>邮件</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="/blog/res/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="/blog/res/css/index.css" type="text/css" rel="stylesheet">


  </head>
  <style type="text/css">
  h1{font-family:STxingkai;color:#02b875;font-size:60px;}
.close{
	opacity:90%;
  }
  </style>
  <body>
    <div class="overlay overlay-mailsent">
	<img onclick=window.open("/blog/index.jsp","_self")  class="close" width="45"  height="45" src="/blog/res/imgs/logo_transparent.png">
		<div class="container">
		<h1>竹博网</h1>
		<h4>我们已经向您的邮箱发送了一个链接来创建账户</h4>
		<h4>请检查您的收件箱</h4>
		<a href="/blog/index.jsp" class="login">好的</a><br>
	</div>
	<a  class="question" href="mailto:gitxiaowen@gmail.com" style="font-size:10px;color:rgba(0,0,0,0.5);">登录有问题？</a></div>

  </body>
</html>
