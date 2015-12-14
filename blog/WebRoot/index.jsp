<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="./res/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		$("#msg").click(function(){
			$.ajax({
				url:'jsonAjax',
				type:'POST',
				data:"{}",
				dateType:"text",
				success:function(data){
					alert("qingqiuchengg");
					var obj=$.parseJSON(data);
					var msg=obj.msg;
				alert(msg)},
				error:function(data)
				{
					alert("返回界面错误");
				}
			})
		})
	
	});
</script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!--  link rel="stylesheet" type="text/css" href="./res/css/test.css">-->
</head>

<body>
	<label>用户名</label>
	<form action="login" method="post">
		<input placeholder="请输入用户名" name="uName" id="uName"><br> <input
			placeholder="请输入密码" type="password" name="uPassword"><br>
		<input type="submit" value="登录">
		
	</form>
	<button id="msg">测试</button>
</body>
</html>
