<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String username = null;

if((String)session.getAttribute("id") != null){
	username = (String)session.getAttribute("name");
}
%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>테스트 홈페이지</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
        }
        nav {
            background-color: #444;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: #fff;
            margin: 0 10px;
            text-decoration: none;
        }
        .content {
            padding: 20px;
            text-align: center;
        }
        .content img {
            max-width: 100%;
            height: auto;
        }
    </style>
</head>
<body>
    <header>
        <h1>테스트 홈페이지</h1>
    </header>
    <nav>

        <a href="newHome.jsp">홈</a>
        <a href="#">설명</a>
<%
if(username != null){
%>
		<a><%=username %></a>
        <a href="logout.jsp">로그아웃</a>
<%
}else{
%>
		<a href="login.jsp">로그인</a>
<%
} 
%>
<%
if(username != null){
%>
		<a> </a>
<%
}else{
%>
		<a href="register.jsp">회원가입</a>
<%
} 
%>		
    </nav>
    <div class="content">
        <h2>테스트</h2>
        <p>테스트</p>
        <img src="images/sample.jpg" alt="Sample Image">
    </div>
</body>
</html>