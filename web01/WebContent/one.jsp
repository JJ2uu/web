<%@page import="multi.mySQL_memberVO"%>
<%@page import="multi.mySQL_memberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함. 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
    <%
    String id = request.getParameter("id");
    
    mySQL_memberDAO dao = new mySQL_memberDAO();
    mySQL_memberVO bag2 = dao.one(id);
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	body {
		background: #f2f2f2;
	}
</style>

</head>
<body>
검색한 아이디 : <%= id %>
<hr>
이름 : <%= bag2.getName() %><br>
비밀번호 : <%= bag2.getPw() %><br>
전화번호: <%= bag2.getTel() %><br>
</body>
</html>