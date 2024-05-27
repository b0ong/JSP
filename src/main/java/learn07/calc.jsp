<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		int result = 0;
	
		if(request.getMethod().equals("POST")) {
			int n1 = Integer.parseInt(request.getParameter("data1"));
			int n2 = Integer.parseInt(request.getParameter("data2"));
			String opt = request.getParameter("opt");
			
			switch(opt) {
			case "+" : 
				result = n1+n2;
				System.out.println(result);
				break;
			case "-" : 
				result = n1 - n2;
				break;
			case "*" : 
				result = n1 * n2;
				break;
			case "/" : 
				result = n1 / n2;
				break;
				
			}
		}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>result = <%= result %></h3>
</body>
</html>