<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String name = (String)session.getAttribute("name");

if(session.getAttribute("name") != null){
	response.sendRedirect("list.jsp");
}else{
	out.println("<script type='text/javascript'>");
    out.println("alert('로그인 후 사용할 수 있습니다.');");
    out.println("window.location.href = 'login.jsp';");
    out.println("</script>");
}

%>