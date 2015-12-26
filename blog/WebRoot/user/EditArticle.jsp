<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑文章</title>
<link href="../res/css/edit.css" rel="stylesheet" type="text/css">
<script src="../ckeditor/ckeditor.js"></script>
</head>
<body>
 <table width="100%" height="100%">
 <form action="Publish" method="post">
     <tr bgcolor="#F0F0F0">
</tr>
   <tr><input name="title" type="text" placeholder="文章标题">
   <div class="btn-publish"> <a class="publish">发表文章</a></div>
   </tr>

 <tr>
 <td><textarea  class="ckeditor" name="aContent" id="content" rows="155">
                            输入文章内容....
         </textarea>
 </td>
  </tr>
      <!--    <script>
           CKEDITOR.replace( 'content' );
        </script> -->
   <tr>
   </tr>
   </form>
  </table>
</body>
</html>