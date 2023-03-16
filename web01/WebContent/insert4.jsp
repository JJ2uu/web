
<%@page import="multi.mySQL_movieVO"%>
<%@page import="multi.mySQL_movieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class = "multi.mySQL_movieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    
    mySQL_movieDAO dao = new mySQL_movieDAO();
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
영화 등록 요청되었음.
<hr>
<!-- request로 받아온 데이터를 출력 -->
아이디 : <%= bag.getId() %> <br>
영화제목 : <%= bag.getTitle() %> <br>
영화내용 : <%= bag.getContent() %> <br>
영화장소 : <%= bag.getLocation() %> <br>
감독 : <%= bag.getDirector() %> <br>

</body>
</html>