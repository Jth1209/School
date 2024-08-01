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
		if(c.getName().equals("username")){
			Cookie cookie = new Cookie("username","lee"); //(key, value)
			cookie.setMaxAge(0);//쿠키의 최대 나이를 0으로 설정하면 지워진 처리가 됨.
			response.addCookie(cookie); //위의 설정들을 실행해 주는 코드 이거 실행 안하면 적용 안됨.
		}
	}
}
%>
login id 쿠키 변경
</body>
</html>