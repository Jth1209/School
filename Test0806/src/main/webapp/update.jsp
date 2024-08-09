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
request.setCharacterEncoding("UTF-8");

//-------------------------------------------------작성자 정보

String num = request.getParameter("num");
String wtitle = request.getParameter("title1");
String wwriter = request.getParameter("writer1");
String wcontent = request.getParameter("content1");

ListDAO dao = new ListDAO();
dao.updateAll(num, wwriter, wtitle, wcontent);

out.println("<script type='text/javascript'>");
out.println("alert('게시글 정보 수정완료');");
out.println("window.location.href = 'list.jsp';");
out.println("</script>");
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