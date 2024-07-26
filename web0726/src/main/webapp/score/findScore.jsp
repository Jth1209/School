<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String find = request.getParameter("");
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
String URL ="jdbc:mysql://localhost:3307/spring5fs";
String sql = "select * from score where num = ?";//like를 쓰고 뒤에 문자에 포함된 단어를 작성해주면 된다.
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,"root","mysql");
pstmt = conn.prepareStatement(sql);
pstmt.setString(1,"");
rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% //학생의 정보를 불러오는 select문을 작성. 추가로 점수의 총점과 평균값 까지 도출

	if(rs.next()){
		String num = rs.getString("num");
		String name = rs.getString("name");
		int kor = rs.getInt("kor");
		int eng = rs.getInt("eng");
		int math = rs.getInt("math");
		
		int sum = kor + eng + math;
		double avg = (double) sum/3;
%>
	<table border = "1">
	<caption><%= name %> 학생의 정보</caption>
	<tr>
	<td><a href = ""><%= num %></a></td><td><%= name %></td><td><%= kor %></td><td><%= eng %></td><td><%= math %></td><td><%= sum %></td><td><%= avg %></td>
	</tr>
<% 
}
%>
</table>
</body>
</html>