<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String deptno1 = request.getParameter("deptno");
Connection conn = null;

String sql = "select * from emp where deptno = ?";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
String id = "root";
String pw = "mysql";

Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, id, pw);
PreparedStatement pstmt = null;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
<title>Insert title here</title>
</head>
<body>
<table border=1>
	<tr>
		<td class="num">사번</td>
		<td class="num">이름</td>
		<td class="regtime">직급</td>
		<td class="writer">월급</td>
	</tr>
<%
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, deptno1);
	ResultSet rs = pstmt.executeQuery();
	
	while(rs.next()){
		String empno = rs.getString("empno");
		String ename = rs.getString("ename");
		String job = rs.getString("job");
		String sal = rs.getString("sal");
%>
	<tr>
		<td><%=empno %></td>
		<td><%=ename %></td>
		<td><%=job %></td>
		<td><%=sal %></td>
	</tr>
<%
	}
%>		
</table>
<hr>


</body>
</html>