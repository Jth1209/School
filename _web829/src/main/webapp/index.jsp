<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection conn = null;

String sql = "select json_object('empno',empno,'ename',ename,'job',job,'sal',sal) from emp;";

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
        
        .num      { width: 500px; }
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	const sql = "http://localhost:3000/emp";
	let json = "";
<%
	pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	
	while(rs.next()){
		String data = rs.getString(1);
%>
	json=JSON.parse('<%=data %>');
	console.log(json);
	
		$.ajax({
			url:sql,
			method:"POST",
			contentType:"application/json",
			data:JSON.stringify(json),
			success: function(data){
				console.log(data);
			},
			error: function(error){
				console.error('Error:',error);
			}
		});
<%
	}
%>
</script>
<div class="show"></div>
</body>
</html>