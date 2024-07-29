<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Connection conn = null;//------------------------------------------------------------------------------------------------------------
PreparedStatement pstmt = null;
String URL = "jdbc:mysql://localhost:3307/spring5fs";
String id = "root";
String pw = "mysql";

Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,id,pw);//기본 데이터베이스 연결 프로그램--------------------------------------------------------------

String idTmp = "";
String nameTmp = "";
String ssnTmp = "";
String telTmp = "";
String balanceTmp = "";
String sqlTmp ="";

//--------------------------------------------------------------------------------------------------------------------------------------
String uid = request.getParameter("id");//num의 값이 널이면 오류(분기점)
String name = request.getParameter("name");
String ssn = request.getParameter("ssn");
String tel = request.getParameter("tel");
String balance = request.getParameter("balance");

String bid = request.getParameter("Bid");
String deposit = request.getParameter("deposit");
String withdraw = request.getParameter("withdraw");

String find = request.getParameter("find");
String delete =request.getParameter("delete");//업데이트 시 넘어오는 매개 변수------------------------------------------------------------------

if(name != null){
	sqlTmp = "select count(*) from account where name = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,name);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);
	if(cnt == 1){
		sqlTmp = "update account set ssn = ?, tel = ?, balance = ? where name = ?";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1,ssn);
		pstmt.setString(2,tel);
		pstmt.setString(3,balance);
		pstmt.setString(4,name);
		pstmt.executeUpdate();
	}else{
		sqlTmp = "insert into account (name,ssn,tel,balance) values (?,?,?,?)";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1,name);
		pstmt.setString(2,ssn);
		pstmt.setString(3,tel);
		pstmt.setString(4,balance);
		pstmt.executeUpdate();
	}
}
if(find != null){
	sqlTmp = "select * from account where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,find);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
	ssnTmp = rs.getString("ssn");
	telTmp = rs.getString("tel");
	balanceTmp = rs.getString("balance");
}

if(delete != null){
	sqlTmp = "delete from accounts where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,delete);
	pstmt.executeUpdate();
}

if(deposit != null){
	sqlTmp = "update account set balance = balance + " + Integer.parseInt(deposit) + " where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,bid);
	pstmt.executeUpdate();
}

if(withdraw != null){
	sqlTmp = "update account set balance = balance - " + Integer.parseInt(withdraw) + " where id = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,bid);
	pstmt.executeUpdate();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	 <style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: #6699ff; }
   		button{ background-color: #cccccc}
    </style>	
<title>계좌 관리 프로그램</title>
</head>
<body>
<form><%-- --------------------------------------------------------------------------------------------------테이블 정보 띄우기 --%>
유저이름: <input type="text" name="name" value="<%=nameTmp %>"><br>
비밀번호: <input type="text" name="ssn" value="<%=ssnTmp %>"><br>
전화번호: <input type="text" name="tel" value="<%=telTmp %>"><br>
계좌잔액: <input type="text" name="balance" value="<%=balanceTmp %>"><br>
<input type="submit" value="입력"><p/><button type="button" onclick="location.href='/web0729/manageBalance.jsp'">입금</button>
&nbsp;&nbsp;<button type="button" onclick="location.href='/web0729/manageBalance2.jsp'">출금</button>
</form><%-- --------------------------------------------------------------------------------------------------테이블 정보 띄우기 --%>
<table border = "1">
<tr>
        <th>번호</th><th>이름</th>
        <th>주민번호</th><th>전화번호</th>
        <th>계좌잔액</th>
        <th>삭제</th>
</tr>
<%
sqlTmp = "select * from account";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	idTmp = rs.getString("id");
	nameTmp = rs.getString("name");
	ssnTmp = rs.getString("ssn");
	telTmp = rs.getString("tel");
	balanceTmp = rs.getString("balance");
%>
<tr>
<td><a href="?find=<%=idTmp%>"><%=idTmp %></a></td><td><%=nameTmp %></td><td><%=ssnTmp %></td><td><%=telTmp %></td><td><%=balanceTmp %></td>
<td><button type="button" onclick="location.href='?delete=<%= idTmp %>'">삭제</button></td>
</tr>
<%	
}
%>
</body>
</html>