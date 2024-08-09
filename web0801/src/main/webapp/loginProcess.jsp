<%@page import="Login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Process</title>
</head>
<body>
<%
p

request.setCharacterEncoding("UTF-8");
    // Sample user data
  

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    LoginDAO dao = new LoginDAO();
    
    if (dao.fineUser(username,password) == true) {
 
        Cookie loginCookie = new Cookie("username",username);
        loginCookie.setMaxAge(60*60);
        response.addCookie(loginCookie);
        out.println("<script type='text/javascript'>");
        out.println("alert('환영합니다, " + username + "님');");
        out.println("window.location.href = 'home.jsp';");
        out.println("</script>");
        
    } else {
    	out.println("<script type='text/javascript'>");
        out.println("alert('로그인 실패!');");
        out.println("window.location.href = 'login.jsp';");
        out.println("</script>");
    }
%>
</body>
</html>