<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
boolean flag = false;

if(cookies != null){
	for(Cookie c : cookies){
		if(c.getName().equals("username")){
			flag = true;
			break;
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<%
if(flag){
	response.sendRedirect("/web0730/list.jsp");

%>
</body>
<%
}else{
%>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<%
out.println("<script type='text/javascript'>");
out.println("alert('로그인 후 사용할 수 있는 기능입니다.');");
out.println("window.location.href = 'home.jsp';");
out.println("</script>");

%>
</body>
</html>
<% 
}
%>