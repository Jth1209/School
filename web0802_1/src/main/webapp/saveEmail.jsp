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
<form action = "saveEmailResult.jsp" metho="post">
	<label for = "email"></label>Email:</lable>
<%
String email = " ";
Cookies cookies = new Cookies(request);
email = cookies.getValue("email");

boolean checked = false;

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
	
	<input type = "submit" value = "Submit">
</form>
</body>
</html>