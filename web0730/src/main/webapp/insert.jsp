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
Connection conn = null;
PreparedStatement pstmt = null;

String URL = "jdbc:mysql://localhost:3307/spring5fs";
String id= "root";
String pw = "mysql";

LocalDateTime lc = LocalDateTime.now();//스레드 사용할 때 자주 사용함

String now = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(lc);

String sqlTmp = "";

//-------------------------------------------------작성자 정보
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,id,pw);

String wtitle = request.getParameter("title1");
String wwriter = request.getParameter("writer1");
String wcontent = request.getParameter("content1");


sqlTmp = "insert into board(writer,title,content,regtime,hits) values (?,?,?,?,0)";
pstmt = conn.prepareStatement(sqlTmp);
pstmt.setString(1,wwriter);
pstmt.setString(2,wtitle);
pstmt.setString(3,wcontent);
pstmt.setString(4,now);
pstmt.executeUpdate();

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