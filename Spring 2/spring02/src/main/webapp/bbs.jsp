<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div {
		margin-bottom: 30px;
	}
</style>
</head>
<body>
	<div>
		<h3>게시글 작성</h3>
		<hr>
		<form action="insert2.multi" method="get">
			title : <input name="title"><br>
			content : <input name="content"><br>
			writer : <input name="writer"><br>
			<button type="submit">서버로 전송</button>
		</form>
	</div>
	<div>
		<h3>게시글 수정</h3>
		<hr>
		<form action="update2.multi" method="get">
			title : <input name="title"><br>
			writer : <input name="writer"><br>
			<button type="submit">서버로 전송</button>
		</form>
	</div>
	<div>
		<h3>게시글 삭제</h3>
		<hr>
		<form action="delete2.multi" method="get">
			writer : <input name="writer"><br>
			<button type="submit">서버로 전송</button>
		</form>
	</div>
	<div>
		<h3>게시글 검색</h3>
		<hr>
		<form action="one2.multi" method="get">
			writer : <input name="writer"><br>
			<button type="submit">서버로 전송</button>
		</form>
	</div>
</body>
</html>