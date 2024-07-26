<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<table border = "1">
<tr bgcolor = "blue">
<td>번호</td><td>이름</td><td>국어</td><td>영어</td><td>수학</td><td>총점</td><td>평균</td>
</tr>
<% 

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String URL ="jdbc:mysql://localhost:3307/spring5fs";
	String sql = "select * from score";//like를 쓰고 뒤에 문자에 포함된 단어를 작성해주면 된다.

	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection(URL,"root","mysql");
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()){
		String num = rs.getString("num");
		String name = rs.getString("name");
		int kor = rs.getInt("kor");
		int eng = rs.getInt("eng");
		int math = rs.getInt("math");
		
		int sum = kor + eng + math;
		double avg = (double) sum/3;
%>
	<tr>
	<td><%= num %></td><td><%= name %></td><td><%= kor %></td><td><%= eng %></td><td><%= math %></td><td><%= sum %></td><td><%= avg %></td>
	</tr>

<% 
	}
%>
</table>
</body>
</html>