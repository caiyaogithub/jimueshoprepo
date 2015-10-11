<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
	<form action="product/modifyProduct" method = "post" enctype="multipart/form-data" >
		<input type = "text" value = "58" name = "product.id" />
		<input type = "text" value = "1" name = "product.superType.id" /><br/>
		<input type ="text" value = "11" name = "product.subType.id"  /><br/>
		<input type = "text" value = "LG" name = "product.brand"  /><br/>
		<input type = "text" value = "LG cookie free touch" name = "product.productName" /><br/>
		<input type = "text" value ="这是一款非智能触屏手机" name = "product.introduce"/><br/>
		<input type = "text" value ="700" name = "product.price"/><br/>　 
		<input type = "text" value ="1000" name = "product.nowPrice"/><br/>　 
		<input type = "text" value ="2012-03-01" name = "product.inTime"/><br/>　 
		<input type = "text" value ="true" name = "product.isNew"/><br/>　 
		<input type = "text" value ="true" name = "product.isSale"/><br/>　 
		<input type = "text" value ="true" name = "product.isHost"/><br/>　 
		<input type = "text" value ="true" name = "product.isSpecial"/><br/>　 
		<input type = "text" value ="10" name = "product.productNum"/><br/>　 
		<input type = "text" value ="39" name = "attrItems[0].id"/><br/>　 
		<input type = "text" value ="38" name = "attrItems[1].id"/><br/>　 
		<input type = "text" value ="37" name = "attrItems[2].id"/><br/>　 
		<input type = "submit" value = "提交" />
	</form>
</body>	
</html>