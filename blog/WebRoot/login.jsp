<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./res/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="./res/css/index.css" type="text/css" rel="stylesheet">
<script src="./res/js/jquery-1.11.2.min.js"></script>
<title>登录/注册</title>
<script>
	$(document).ready(function(){
		$("a[name='login']").click(function(){
			var email=$("#email").val();
			alert(email);
			$("a[name='login']").attr('href','LoginAction?email='+email);
		});
	});
</script>
</head>
<body>
 	<div class="overlay overlay-login">
		<img onclick=window.open("/blog/index.jsp","_self")  class="close" width="45"  height="45" src="/blog/res/imgs/logo_transparent.png">
		<div class="container">
		<h2>Share your ideas</h2>
		<h4>输入邮箱，登录或创建账户</h4>
		<input id="email" name="email" placeholder="yourname@example.com"><br>
		<a class="login" name="login" type="submit">登录</a> 
		<a href="/blog/index.jsp" class="cancel">取消</a>
		</div>
	</div>
</body>
</html>