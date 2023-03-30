<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
	session.setAttribute("view", 100);
%>
</head>
<body>
세션심었따
<a href = "page4.jsp">세션 보러가자</a>
</body>
</html>