<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "checkEmailResult.jsp" method="post">
	<label for = "email"></label>Email:</lable>
<%
String email = " ";
boolean rememberMe = false;
Cookies cookies = new Cookies(request);
if(cookies.getValue("email")!=null){
	email = cookies.getValue("email");
	rememberMe = true;
}


if(email != null){
%>
	<input type = "email" id = "email" name = "email" value = "<%=email %>" required><br>
<%
}else {
%>
	<input type = "email" id = "email" name = "email" value = "" required><br>
	
<%
}
%>
	<input type = "checkBox" id = "rememberMe" name = "rememberMe" <%= rememberMe ? "checked" : "" %>>
	<label for="rememberMe">Remember Me</label><br>
	<input type = "submit" value = "Submit">
</form>
</body>
</html>