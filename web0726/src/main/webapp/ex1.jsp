<%@page import="java.util.Comparator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1부터 10까지의 합</title>
</head>
<body>
<%
	int sum = 0;
	for(int i = 1; i<11; i++){
%>
	<h2><%= sum %></h2>
<%  sum += i;
}
%>

<h1>1부터 10까지의 합은 <%= sum %> 입니다.</h1>
</body>
</html>