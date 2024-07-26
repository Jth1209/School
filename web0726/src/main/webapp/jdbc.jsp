<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String loc2 = request.getParameter("loc");
if("".equals(loc2)){
	loc2 = "%";
}
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String URL ="jdbc:mysql://localhost:3307/spring5fs";
String sql = "select * from dept where loc like ?";//like를 쓰고 뒤에 문자에 포함된 단어를 작성해주면 된다.

Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,"root","mysql");
pstmt = conn.prepareStatement(sql);
pstmt.setString(1,loc2);
rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action>
지역 : <input type = "text" name = "loc">
<input type = "submit" value ="결과"><p/>
</form>
<table border = "1">
<tr>
	<td colspan = 3><h1>Dept Table</h1></td>
</tr>
<%
while(rs.next()){
	String deptno = rs.getString("deptno");
	String dname = rs.getString("dname");
	String loc = rs.getString("loc");
%>
	<tr>
	<td><%= deptno %></td><td><%= dname %></td><td><%=loc %></td>
	</tr>
<%
}
%>
</table>
</body>
</html>