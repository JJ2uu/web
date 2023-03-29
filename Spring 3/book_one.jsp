<%--
  Created by IntelliJ IDEA.
  User: jihun
  Date: 2023/03/28
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        body {
            background: yellow;
        }
    </style>
</head>
<body>
북마크 검색 완료.
<hr>
검색된 id는 ${dto.id} <br>
검색된 name은 ${dto.name} <br>
검색된 url은 ${dto.url} <br>
</body>
</html>
