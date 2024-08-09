<%@page import="list.ListDTO"%>
<%@page import="java.util.List"%>
<%@page import="list.ListDAO"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
p

request.setCharacterEncoding("UTF-8");

ListDAO dao = new ListDAO();

String wnum = request.getParameter("find");
String title2 = (String)request.getAttribute("intitle");
title2 = request.getParameter("intitle");
String writer2 = (String)request.getAttribute("inwriter");
title2 = request.getParameter("inwriter");
String content2 = (String)request.getAttribute("incontent");
title2 = request.getParameter("incontent");

List<ListDTO> dto = dao.selectAll();
%>
<%
p

String name = (String)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
    	body      {background-color:#ffffff;}
    	header	  {background-color:#BECDFF;}
        table     { width:680px; text-align:center; margin: auto; }
        th        { background-color:#000000; color:#ffffff;}
        h1        {text-align: center}
        .find-btn {text-align: center; margin:auto;}
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:#000000; }
        a:visited { text-decoration:none; color:#999; }
        a:hover   { text-decoration:none; color:#ff3232;  }
    </style>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MLC</title>
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
             	p

             	             		if(name != null){
             	%>
             	<li><a href="#"><%=t( nam%>님</a></li>
             	<%
             	p
             	 		
             	             		}else{
             	%>
             	<li><a></a></li>
             	<%
             	p
             	 
             	             		}
             	%>
             	<%
             	p

             	             		if(name != null){
             	%>
             	<li><a href="logout.jsp">Logout</a></li>
             	<%
             	p
             	 		
             	             		}else{
             	%>
                <li><a href="login.jsp">Login</a></li>
             	<%
             	p
             	 
             	             		}
             	%>
             	<%
             	p

             	             		if(name != null){
             	%>
             	<li><a href="userInfo.jsp">정보수정</a></li>
             	<%
             	p
             	 		
             	             		}else{
             	%>
                <li><a href="register.jsp">Join</a></li>
             	<%
             	p
             	 
             	             		}
             	%>
            </ul>
        </div>
    </header>
<input type = "hidden" name="addhit">
<section>
	<h1>게시판</h1>
	<table>
	    <tr>
	        <th class="num"    >번호    </th>
	        <th class="title"  >제목    </th>
	        <th class="writer" >작성자  </th>
	        <th class="regtime">작성일시</th>
	        <th                >조회수  </th>
	    </tr>
	    
	<%
	    	p

	    		for(ListDTO dt: dto){
	    	%>
	    <tr>
	        <td><%=dt.getNum() %></td>
	        <td style="text-align:left;">
	            <a href="view.jsp?num=<%=dt.getNum() %>"><%=dt.getTitle() %></a>
	            <input type = "hidden" name = "addhit" value = "<%=dt.getNum() %>">
	        </td>
	        <td><%=dt.getWriter() %></td>
	        <td><%=dt.getRegtime() %></td>
	        <td><%=dt.getHits() %></td>
	    </tr>
	<%
	} 
	%>
	</table>
<br>
<div class="find-btn">
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">
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