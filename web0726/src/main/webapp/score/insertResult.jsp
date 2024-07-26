<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
try{
	int num = Integer.parseInt(request.getParameter("num"));
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String URL ="jdbc:mysql://localhost:3307/spring5fs";
	String sql = "insert into score (num,name,kor,eng,math) values (?,?,?,?,?)";//like를 쓰고 뒤에 문자에 포함된 단어를 작성해주면 된다.

	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection(URL,"root","mysql");
	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1,num);
	pstmt.setString(2,name);
	pstmt.setInt(3,kor);
	pstmt.setInt(4,eng);
	pstmt.setInt(5,math);
	pstmt.executeUpdate();
	out.println("<h1>데이터 저장 완료</h1>");
}catch (NumberFormatException e){
	out.println("<h1>!!모든 정보를 입력해야 합니다!!</h1>");
}
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