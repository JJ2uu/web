<%@page import="java.util.ArrayList"%>
<%@page import="multi.mySQL_bbsVO"%>
<%@page import="multi.mySQL_bbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함. 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
    <%
    mySQL_bbsDAO dao = new mySQL_bbsDAO();
   	ArrayList<mySQL_bbsVO> list = dao.list();

    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
	body {
		background: #f2f2f2;
	}
	a {
		text-decoration: none;
		color: black;
	}
</style>

</head>
<body>
<table class="table table-hover">
	<tr>
		<td>NO</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>
<% // for문 시작
	for(mySQL_bbsVO bag2: list) {
%>
	<tr>
		<td><%= bag2.getNo() %></td>
		<td>
			<a href = "http://localhost:8888/web01/one2.jsp?no=<%= bag2.getNo() %>">
				<%= bag2.getTitle() %>
			</a>
		</td>
		<td><%= bag2.getContent() %></td>
		<td><%= bag2.getWriter() %></td>
	</tr>
<% } // for문 끝%>
</table>
</body>
</html>