<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 선언부 --%>
<%!
public int add (int n1, int n2) {
	return n1 + n2;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		int result = add(10, 20);
	%>
	<%--  표현식 --%>
	덧셈결과: <%= result %>
	<br>
	덧셈결과: <%= add(20, 30) %>
</body>
</html>