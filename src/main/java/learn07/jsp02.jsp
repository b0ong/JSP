<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = "Adam";
		String pw = "1234";
	%>
	<div>
		id <input type="text" name="id" value="<%= id %>">
	</div>
	<div>
		pw <input type="password" name="pw" value="<%= pw %>">
	</div>
</body>
</html>