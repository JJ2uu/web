<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String no = request.getParameter("no");
    String content = request.getParameter("content");
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
수정할 게시글 번호 : <%= no %> <br>
수정할 내용 : <%= content %> <br>
</body>
</html>