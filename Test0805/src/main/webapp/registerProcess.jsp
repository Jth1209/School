<%@page import="Login.LoginDTO"%>
<%@page import="Login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    p

        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        LoginDAO dao = new LoginDAO();
        LoginDTO dto = new LoginDTO(username,password,email);
        dao.insertUser(dto);

        out.println("<script type='text/javascript'>");
        out.println("alert('회원가입 성공');");
        out.println("window.location.href = 'index.jsp';");
        out.println("</script>");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
</body>
</html>