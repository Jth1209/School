<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("password");

if(id.equals(pw)){
	response.addCookie(
		Cookies.createCookie("AUTH",id,"/", -1)
	);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
로그인에 성공하였습니다.
</body>
</html>
<%
} else {
%>
<script>
alert("로그인에 실패했습니다.");
history.go(-1);
</script>
<%
}
%>