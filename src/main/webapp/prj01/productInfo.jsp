<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-05-27
  Time: 오전 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>상품 정보 조회</h2>
    <hr>
    <ul>
        <li>상품코드: ${p.id }</li>
        <li>상품 명: ${p.name }</li>
        <li>제조사: ${p.maker }</li>
        <li>가격: ${p.price }</li>
        <li>등록일: ${p.date }</li>
    </ul>
</body>
</html>
