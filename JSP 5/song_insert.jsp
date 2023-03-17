
<%@page import="multi.mySQL_songVO"%>
<%@page import="multi.mySQL_songDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class = "multi.mySQL_songVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    
	mySQL_songDAO dao = new mySQL_songDAO();
    dao.insert(bag);
    
	%>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
<title>Insert title here</title>

<style>
	body {
		position: relative;
		font-family: 'Gowun Dodum', sans-serif;
	}
	
	.main {
		width: 100%;
		height: 100%;
		position: absolute;
		margin-top: 12%;
	}

	.header {
		text-align: center;
	}
	.content {
		text-align: center;
	}
	table {
		margin-left: auto;
		margin-right: auto;
	}
	td {
		padding : 20px;
	}
</style>

</head>
<body>
<div class = "main">
<div class = "header">
<h3>등록이 완료되었습니다.</h3>
<hr width=50%>
</div>
<!-- request로 받아온 데이터를 출력 -->
<div class = "content">
<table border = "1">
	<tr border = "1">
		<td>노래제목</td>
		<td>가수</td>
		<td>앨범 자켓 사진</td>
	</tr>
	<tr>
		<td><%= bag.getTitle() %></td>
		<td><%= bag.getArtist() %></td>
		<td><img src="img/<%= bag.getImg() %>" width = 200px;></td>
	</tr>
</table>
</div>
</div>
</body>
</html>