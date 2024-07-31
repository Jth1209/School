<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 변경</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null && cookies.length > 0){
	for(Cookie c : cookies){
		if(c.getName().equals("loginId")){
			Cookie cookie = new Cookie("loginId","lee"); //(key, value)
			response.addCookie(cookie); 
		}
	}
}
%>
login id 쿠키 변경
</body>
</html>