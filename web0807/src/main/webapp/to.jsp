<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>TO 페이지</h1>
<h1>${gugu}단</h1>

<c:forEach var="dan" begin="1" end="9">
	${gugu} X ${dan} = ${gugu*dan}<br>
</c:forEach>
</body>
</html>