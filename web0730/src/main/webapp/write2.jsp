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
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<form method="post" action="update.jsp">
	<input type="hidden" name = "num" value = "<%=lnum %>"><%--숨겨진 변수 다른 웹페이지에서 매개변수로 활용 --%>
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title1"  maxlength="80"
                       value="<%=rs.getString("title") %>">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer1" maxlength="20"
                       value="<%=rs.getString("writer") %>">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content1" rows="10"><%=rs.getString("content") %></textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>
</body>
</html>