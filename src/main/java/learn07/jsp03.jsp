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
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			
		}
		System.out.println("sum: " + sum);
	%>
	<%= "1~100까지 더한 값: " + sum %>
</body>
</html>