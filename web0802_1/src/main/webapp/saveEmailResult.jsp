<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String email = request.getParameter("email");

	response.addCookie(
			Cookies.createCookie("email",email,"/",-1)
		);
	response.sendRedirect("saveEmail.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>