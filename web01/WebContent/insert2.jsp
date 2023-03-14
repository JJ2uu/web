<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야함. 자바로 짜야함 -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함 -->
    <%
 	// 스크립 트릿 - 조금 코드를 써서 만드는 작은 프로그램
    // 자바 코드 넣는 부분.
    // HttpServletRequest request = new HttpServletRequest();
    // tomcat은 미리 request 객체를 만들어서 내장시켜놓음.
    // 받은 데이터를 변수에 저장 (입력값은 전부 String 타입)
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
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
게시글 작성 요청되었음.
<hr>
<!-- request로 받아온 데이터를 출력 -->
작성 번호 : <%= no %> <br>
제목 : <%= title %> <br>
내용 : <%= content %> <br>
작성자 : <%= writer %> <br>
</body>
</html>