<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String wtitle = request.getParameter("title1");
String wwriter = request.getParameter("writer1");
String wcontent = request.getParameter("content1");


BoardDAO dao = new BoardDAO();
BoardDTO dto = new BoardDTO(0,wwriter,wtitle,wcontent,"",0);
dao.insertBoard(dto);

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