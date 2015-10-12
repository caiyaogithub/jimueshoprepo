<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加广告</title>
</head>
<body>
	<form action="ad/modifyAd" method = "post" enctype="multipart/form-data" >
		<input type = "text" name = "ad.id" value = "61" /><br/>
		<input type = "text" name = "ad.subType.id" value = "11" /><br/>
		<input type = "text" name = "ad.product.id" value = "44" /><br/>
		<input type = "text" name = "ad.adDesc" value = "这是修改以后的描述" /><br/>
		<input type = "text" name = "ad.beginTime" value = "2015-09-10" /><br/>
		<input type = "text" name = "ad.endTime" value = "2015-10-30" /><br/>
		<input type = "submit" value = "提交" /><br/>
	</form>
</body>
</html>