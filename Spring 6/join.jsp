<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 일기장</title>
<link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
<style>
	body {
		position: relative;
		font-family: 'Gowun Dodum', sans-serif;
		background: #f2f2f2;
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
	.title {
		text-align: left;
		width: 80px;
	}
	input {
		width: 205px;
		height: 40px;
		padding: 0;
		border-color: transparent;
		border-radius: 6px;
		font-size: 16px;
	}
	input:focus {
		outline: 2px solid #24abff;
		border-radius: 6px;
		outline-offset: 0;
		border-color: transparent;
	}
	button {
		width: 300px;
		height: 50px;
		padding: 0;
		margin-top: 10px;
		margin-bottom: 20px;
		color: #fff;
		background: #24abff;
		border-color: transparent;
		border-radius: 6px;
	}
	button:hover {
		color: #fff;
		background: #000;
		border-color: transparent;
		transition: 0.5s;
		border-radius: 6px;
	}
</style>
</head>
<body>
<div class = "main">
	<div class = "header">
		<h2>회원가입</h2>
		<hr width = "50%">
	</div>
	<div class = "content">
		<form action = "join" method="get">
			<table> 
				<tr>
					<td class ="title"><h4>아이디</h4></td>
					<td><input type = "text" name = "id"></td>
				</tr>
				<tr>
					<td class ="title"><h4>비밀번호</h4></td>
					<td><input type = "password" name = "pw"></td>
				</tr>
				<tr>
					<td class ="title"><h4>이름</h4></td>
					<td><input type = "text" name = "name"></td>
				</tr>
				<tr>
					<td class ="title"><h4>전화번호</h4></td>
					<td><input type = "text" name = "tel"></td>
				</tr>
				<tr>
					<td colspan="2"><button>회원가입 완료</button></td>
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>