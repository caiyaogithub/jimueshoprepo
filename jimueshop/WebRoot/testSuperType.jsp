<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addOrModifySuperType</title>
</head>
<body>
	<form action="product/addOrModifySuperType" method = "get">
		<input type = "hidden" name = "operator" value = "2" /><br/>
		<input type = "text" name = "superType.typeName" value = "水果修改"/><br/>
		<input type = "text" name = "superType.id" value = "18"  /><br/>
		<input type = "submit" value = "添加" /><br/>
	</form>
</body>
</html>