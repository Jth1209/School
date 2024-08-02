<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println(session.getCreationTime());//얘네를 바로 사용할 수 없기 때문에 Formatter.format(time)을 사용해야 한다.
	System.out.println(session.getLastAccessedTime());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션ID: <%= session.getId() %> <br>
<%
	time.setTime(session.getCreationTime());
%>
세션생성시간: <%= formatter.format(time) %><br>
<%
	time.setTime(session.getLastAccessedTime());
%>
최근접근시간 : <%= formatter.format(time) %>
</body>
</html>