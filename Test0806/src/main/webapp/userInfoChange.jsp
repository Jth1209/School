<%@page import="Login.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
String pw = request.getParameter("password");
String name = request.getParameter("name");

DAO dao = new DAO();
dao.updateInfo(pw, name, (String)session.getAttribute("id"));//세션을 이용해서 아이디를 받아와 해당 데이터베이스 정보를 업데이트

out.println("<script type='text/javascript'>");
out.println("alert('정보 수정 완료.');");
out.println("window.location.href = 'index.jsp';");
out.println("</script>");
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