<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 목록</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null && cookies.length > 0){
	for(Cookie c : cookies){
		out.println("<br>" + c.getName() + " = ");
		out.println(c.getValue());
	}
}
%>
</body>
</html>