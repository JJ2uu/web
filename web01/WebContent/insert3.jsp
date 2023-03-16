<%@page import="multi.mySQL_productDAO"%>
<%@page import="multi.mySQL_productVO"%>
<%@page import="multi.mySQL_bbsDAO"%>
<%@page import="multi.mySQL_bbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id ="bag" class = "multi.mySQL_productVO"></jsp:useBean>
    <jsp:setProperty property = "*" name = "bag"/>

    <%
   	/* 
   	String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img");
    
    mySQL_productVO bag = new mySQL_productVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img);
    */

    mySQL_productDAO dao = new mySQL_productDAO();
    dao.insert(bag);
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
상품 등록 요청되었음.
<hr>
<!-- request로 받아온 데이터를 출력 -->
아이디 : <%= bag.getId() %> <br>
상품명 : <%= bag.getName() %> <br>
상품종류 : <%= bag.getContent() %> <br>
가격 : <%= bag.getPrice() %> <br>
제조사 : <%= bag.getCompany() %> <br>
이미지 : <img src = "img/<%= bag.getImg()%>"> <br>

</body>
</html>