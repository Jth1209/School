<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Cookies cookies = new Cookies(request);
%>
<!DOCTYPE html>
<html>
<head>
<title>로그인여부 검사</title>
</head>
<body>
<%
	if(cookies.exists("email")){
%>
아이디 "<%= cookies.getValue("email") %>" 로 로그인 한 상태
<%
	}else {
%>
로그인 하지 않은 상태
<%
	}
%>
</body>
</html>