<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		text-align: center;
		background-image: url("https://assets.nflxext.com/ffe/siteui/vlv3/2e884ce2-da1c-4501-ab9a-10c534d30975/fcdbcd90-f133-4081-ac82-34918f18aabf/KR-ko-20230327-popsignuptwoweeks-perspective_alpha_website_large.jpg");
	}
	div {
		margin: 18% auto auto auto;
	}
	button {
		border-color: transparent;
		width: 200px;
		height: 100px;
		margin: 5px;
		border-radius: 10px;
		background: #000;
		color: #fff;
		font-size: 16px;
	}
	
	button:hover {
		background: #24abff;
		transition: 0.5s;
	}
	
	form {
		display: inline;
	}
	
	h3 {
		color: #fff;
	}
	
</style>
</head>
<body>
<div>
<h3>영화 목록</h3>
	<form action = "movie_list">
		<button>전체 목록</button>
	</form>
	<form action = "genre_list" method = "get">
		<button value ="코미디" name="genre">코미디</button>
		<button value ="드라마" name="genre">드라마</button><br>
		<button value ="액션" name="genre">액션</button>
		<button value ="범죄/스릴러" name="genre">범죄/스릴러</button>
		<button value ="애니메이션" name="genre">애니메이션</button>
	</form>
</div>
</body>
</html>