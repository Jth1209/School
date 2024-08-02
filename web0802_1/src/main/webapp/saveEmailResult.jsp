<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String email = request.getParameter("email");

	response.addCookie(
			Cookies.createCookie("email",email,"/",-1)
		);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
alert("저장 성공")
history.go(-1)
</script>
</body>
</html>