
<%@page import="multi.mySQL_productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함. 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
    <%
    String id = request.getParameter("id");
    
    mySQL_productDAO dao = new mySQL_productDAO();
    dao.delete(id);

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
상품 삭제 요청되었음.
<hr>
<!-- request로 받아온 데이터를 출력 -->
삭제할 게시글 번호 : <%= id %>
</body>
</html>