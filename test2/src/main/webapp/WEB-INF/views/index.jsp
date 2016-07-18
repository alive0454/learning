<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<p>${message}</p>

	<h2>action02</h2>
	<form method="post" action="/test2/action02">
		username:<input name="username" /><br /> pdctname:<input
			name="product.name" /><br />
		<button>提交</button>
	</form>

	<h2>action06</h2>
	<form action="/test2/action06">
		<input type="checkbox" value="15" name="id" />阅读 <input
			type="checkbox" value="20" name="id" />上网 <input type="checkbox"
			value="25" name="id" />旅游 <input type="submit" value="提交" />
	</form>
</body>
</html>