<%@page import="multi.mySQL_productDAO"%>
<%@page import="multi.mySQL_productVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String id = request.getParameter("id");
    String price = request.getParameter("price");
    
    mySQL_productVO bag = new mySQL_productVO();
	bag.setId(id);
	bag.setPrice(Integer.parseInt(price));
	
	mySQL_productDAO dao = new mySQL_productDAO();
	dao.update(bag);
    %>

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
<!-- request로 받아온 데이터를 출력 -->
수정할 상품 아이디 : <%= id %> <br>
수정할 상품 가격 : <%= price %> <br>
</body>
</html>