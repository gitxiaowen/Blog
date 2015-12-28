<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑文章</title>
<link href="../res/css/edit.css" rel="stylesheet" type="text/css">
<script src="/blog/res/js/jquery-1.11.2.min.js"></script>
<script src="../ckeditor/ckeditor.js"></script>
<script>
	$(document).ready(function(){
		$(".btn-publish").click(function(){
			//准备参数
			var editor = null;
			editor=CKEDITOR.instances.content;
			var content=editor.getData();
			//类型
			var type=$("select  option:selected").val();
			var title=$("#title").val();
			$.ajax({
				type:"POST",
				url:"publishAction",
				data:{aContent:content,aType:type,aTitle:title},
				success:function(data){
					alert("成功进入Action");
				},

			});
		});
		
		
	});

</script>
</head>
<body>
 <table width="100%" height="100%">
 <form action="Publish" method="post">
   <tr><input id="title" name="title" type="text" placeholder="文章标题">
   <div class="aType">
   <select>  
  <option value ="1">编程语言</option>  
  <option value ="2">框架分析</option>  
  <option value="3">云计算</option>  
  <option value="4">移动开发</option>
  <option value ="5">Web前端</option>  
  <option value ="6">互联网</option>  
  <option value="7">数据库</option>  
  <option value="8">系统运维</option> 
	</select>
</div>
   <div class="btn-publish"> <a id="publish" class="publish">发表文章</a></div>

 <td><textarea  class="ckeditor" name="aContent" id="content" rows="155">
                            输入文章内容....
         </textarea>
 </td>

   </tr>

   </form>
  </table>
</body>
</html>