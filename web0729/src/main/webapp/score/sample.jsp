<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");

String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");

String find = request.getParameter("find");
String delete = request.getParameter("delete");

Connection conn = null;
PreparedStatement pstmt = null;
String URL = "com.mysql.cj.jdbc.Driver";
String id = "root";
String pw = "mysql";

String sql ="";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: cyan; }
    </style>
<title>학생 점수 관리 프로그램</title>
</head>
<body>
<form>
학번: <input type="text" name="num" value=""><br>
이름: <input type="text" name="name" value=""><br>
    국어: <input type="text" name="kor" value=""><br>
    영어: <input type="text" name="eng" value=""><br>
    수학: <input type="text" name="math" value=""><br>
    <input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
</tr>
<%
sql = "select * from score";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
while(rs.next()){
	String num1 = rs.getString("num");
	String name1 = rs.getString("name");
	String kor1 = rs.getString("kor");
	String eng1 = rs.getString("eng");
	String math1 = rs.getString("math");
	
	int sum = Integer.parseInt(kor1)+Integer.parseInt(eng1)+Integer.parseInt(math1);
	double avg = (double) sum/ 3;
%>
	<tr>
	
	</tr>

<% 
}
%>
</table>
</body>
</html>