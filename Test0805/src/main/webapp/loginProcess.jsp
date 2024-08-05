<%@page import="Login.DTO"%>
<%@page import="Login.DAO"%>
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
request.setCharacterEncoding("UTF-8");
    // Sample user data
  

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    DAO dao = new DAO();
    DTO dto = dao.findId(username,password);
    
    if (dto != null) {
        session.setAttribute("name", dto.getName());
        session.setAttribute("id", dto.getId());
        response.sendRedirect("index.jsp");
    } else {
    	out.println("<script type='text/javascript'>");
        out.println("alert('로그인 실패!');");
        out.println("window.location.href = 'login.jsp';");
        out.println("</script>");
    }

%>
</body>
</html>