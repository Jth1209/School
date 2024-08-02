<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	response.addCookie(
			Cookies.createCookie("AUTH","","/",0)//static메소드를 클래스 이름으로 가지고 와서 MaxAge값을 0으로 만들었음.
		);
%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

</body>
</html>