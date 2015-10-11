<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>改变商品图片</title>
</head>
<body>
	<form action="product/changeProductPicture" method = "post" enctype="multipart/form-data">
		<input type = "text" name = "productId" value = "58" /><br/>
		<input type = "file" name = "productPicture" /><br/>
		<input type = "submit" value = "提交" /><br/>
	</form>
</body>
</html>