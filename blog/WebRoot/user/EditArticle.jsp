<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑文章</title>
<script src="../ckeditor/ckeditor.js"></script>
</head>
<body>
 <table width="100%" height="100%">
 <form action="Publish" method="post">
     <tr bgcolor="#F0F0F0">
<td background="图片地址.jpg">
<b><font color="white">■ 发表文章</font></b>
</td>
</tr>
   <tr> <td align="left">【请输入文章的题目......】</td></tr>
    <tr><td align="center"><input type=text  name="aTitle" id="title" style="width:100%;height:100%";text-align:left;vertical-align:middle" ></td>
   </tr>                    
    
 
 <tr>
 <td><textarea  class="ckeditor" name="aContent" id="content">
                            输入文章内容....
         </textarea>
 </td>
  </tr>
      <!--    <script>
           CKEDITOR.replace( 'content' );
        </script> -->
   <tr>
       <td>
       <input  type=submit value="发表帖子"/>
       <input  type=reset value="取消发表"/>
       </td>
   </tr>
   </form>
  </table>
</body>
</html>