<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
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

LocalDateTime lc = LocalDateTime.now();//스레드 사용할 때 자주 사용함

String now = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(lc);

String sqlTmp = "";
String num = "";
String writer = "";
String title = "";
String content = "";
String regtime = "";
String hits = "";

//-------------------------------------------------작성자 정보
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL,id,pw);

String wnum = request.getParameter("find");
String title2 = (String)request.getAttribute("intitle");
title2 = request.getParameter("intitle");
String writer2 = (String)request.getAttribute("inwriter");
title2 = request.getParameter("inwriter");
String content2 = (String)request.getAttribute("incontent");
title2 = request.getParameter("incontent");


if(title2 != null){
	sqlTmp = "insert into board (writer,title,content,regtime) values (?,?,?,?)";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,writer2);
	pstmt.setString(2,title2);
	pstmt.setString(3,content2);
	pstmt.setString(4,now);
	pstmt.executeUpdate();
}
/*if(wnum != null){
	sqlTmp = "update board set title = ?, writer = ?, content = ?, regtime= ?, hits = 0 where num = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,wtitle);
	pstmt.setString(2,wwriter);
	pstmt.setString(3,wcontent);
	pstmt.setString(4,now);
	pstmt.setString(5,wnum);
	pstmt.executeUpdate();
}*/
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
</head>
<body>
<table>
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
<%
sqlTmp = "select * from board";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();
while(rs.next()){
	num = rs.getString("num");
	writer = rs.getString("writer");
	title = rs.getString("title");
	content = rs.getString("content");
	regtime = rs.getString("regtime");
	hits = rs.getString("hits");
%>
    <tr>
        <td><%=num %></td>
        <td style="text-align:left;">
            <a href="view.jsp?num=<%=num %>"><%=title %></a>
        </td>
        <td><%=writer %></td>
        <td><%=regtime %></td>
        <td><%=hits %></td>
    </tr>
<%
}
%>
</table>
<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">

</body>
</html>