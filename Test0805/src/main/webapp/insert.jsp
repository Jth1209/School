<%@page import="list.ListDAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
p

request.setCharacterEncoding("UTF-8");

ListDAO dao = new ListDAO();

String wtitle = request.getParameter("title1");
String wwriter = request.getParameter("writer1");
String wcontent = request.getParameter("content1");

dao.insert(wwriter, wtitle, wcontent);

response.sendRedirect("list.jsp");
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