<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
Connection conn = null;
PreparedStatement pstmt = null;

String URL = "jdbc:mysql://localhost:3307/spring5fs";
String id= "root";
String pw = "mysql";

String lnum = request.getParameter("num");

Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,id,pw);

String sql = "select * from board where num = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1,lnum);
ResultSet rs = pstmt.executeQuery();
rs.next();
int hits = rs.getInt("hits");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>
<table>
    <tr>
        <th>제목</th>
        <td><%=rs.getString("title") %></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><%=rs.getString("writer") %></td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td><%=rs.getString("regtime") %></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%=hits %></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%=rs.getString("content") %></td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write2.jsp?num=<%=rs.getString("num") %>'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=<%=rs.getString("num") %>'">

</body>
</html>