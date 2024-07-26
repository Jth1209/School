<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
<h1>While Example</h1>
<%
	request.setCharacterEncoding("utf-8");
	String doc = request.getParameter("string");
	int num = Integer.parseInt(request.getParameter("num"));
	for(int i = 1; i < num+1 ; i++){
%>
 	<p><%=doc %></p>
 <%
 }
 %>
</body>
</html>