<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = request.getParameter("name");
String color = request.getParameter("color");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>색상 선택</title>
</head>
<%--<%
	if(color.equals("red")) {
%>
	<body bgcolor = "red">
<% }else if(color.equals("blue")){
%>
	<body bgcolor = "blue">
<% }else { 
%>
    <body bgcolor = "yellow">
<% 
}
%>--%>
<body bgcolor =<%= color%>>
<h1>If-else Example</h1>
<%= name%><br>
<%= color%>
</body>
</html>