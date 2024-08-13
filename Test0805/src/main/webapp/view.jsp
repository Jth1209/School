<%@page import="list.DTO"%>
<%@page import="list.DAO"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");//구현부와 화면에 보여지는 부분을 나누어 작성한 형태

String name = (String)session.getAttribute("name");

String lnum = request.getParameter("num");

DAO dao = new DAO();
dao.hits(lnum);

DTO dto = dao.selectNum(lnum);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; margin:auto}
        th    { width:100px; background-color:#000000; color:#ffffff; }
        td    { text-align:left; border:1px solid gray; }
        header	  {background-color:#BECDFF;}
        h1        {text-align: center}
        .find-btn {text-align: center; border:1x solid #000000;}
    </style>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MLC</title>
    <link rel="icon" href="mang.png" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
</head>
<body>
<header>
        <div class="inner">
            <h1><a href="index.jsp">Home</a></h1>

            <ul id="gnb">
                <li><a href="https://www.manutd.com/ko">GALLERY</a></li>
                <li><a href="https://www.youtube.com/@manutd">YOUTUBE</a></li>
                <li><a href="newlist.jsp">게시판</a></li>
                <li><a href="https://www.manutd.com/en/visit-old-trafford/museum-stadium-tours?t=y&utm_source=google&utm_medium=cpc&utm_campaign=museum&gad_source=1&gclid=EAIaIQobChMIiq3A0obdhwMVJOMWBR3uZA6wEAAYASAAEgJc1_D_BwE">LOCATION</a></li>
            </ul>

            <ul class="util">
             	<%
             		if(name != null){
             	%>
             	<li><a href="#"><%= name %>님</a></li>
             	<% 		
             		}else{
             	%>
             	<li><a></a></li>
             	<% 
             		}
             	%>
             	<%
             		if(name != null){
             	%>
             	<li><a href="logout.jsp">Logout</a></li>
             	<% 		
             		}else{
             	%>
                <li><a href="login.jsp">Login</a></li>
             	<% 
             		}
             	%>
             	<%
             		if(name != null){
             	%>
             	<li><a href="userInfo.jsp">정보수정</a></li>
             	<% 		
             		}else{
             	%>
                <li><a href="register.jsp">Join</a></li>
             	<% 
             		}
             	%>
            </ul>
        </div>
    </header>
<section>
<h1>게시글 정보</h1>
	<table>
	    <tr>
	        <th>제목</th>
	        <td><%=dto.getTitle() %></td>
	    </tr>
	    <tr>
	        <th>작성자</th>
	        <td><%=dto.getWriter() %></td>
	    </tr>
	    <tr>
	        <th>작성일시</th>
	        <td><%=dto.getContent() %></td>
	    </tr>
	    <tr>
	        <th>조회수</th>
	        <td><%=dto.getHits() %></td>
	    </tr>
	    <tr>
	        <th>내용</th>
	        <td><%=dto.getRegtime() %></td>
	    </tr>
	</table>

<br>
<div class="find-btn">
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write2.jsp?num=<%=dto.getNum() %>'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=<%=dto.getNum() %>'">
</div>
</section>
<footer>
        <div class="inner">
            <div class="upper">
                <h1>MLC HomePage</h1>
                <ul>
                    <li><a href="https://namu.wiki/w/%EB%82%98%EB%AC%B4%EC%9C%84%ED%82%A4:%EB%8C%80%EB%AC%B8">제작지원: namuwiki</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    맨체스터 유나이티드를 사랑하는 사람들이 모여있는 홈페이지입니다.<br>
                </address>
                <p>
                    2024 MLC &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
</body>
</html>