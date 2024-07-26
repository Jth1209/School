<%@page import="java.time.LocalTime"%>
<%@ page import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("이자식봐라?<br>");
	//Date now = new Date();
	out.println("<br>");
%>
<h1>지금 시각은 <%=LocalTime.now() %> 입니다.</h1>
</body>
</html>