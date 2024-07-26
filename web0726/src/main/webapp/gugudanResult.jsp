<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("dan"));
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= num %></title>	
<table border="1">
<tr>
<td><%= num %> 단</td>
</tr>
</table>
<%for(int i = 1; i< 10; i++){
%>
	<table border="1">
	<tr>
	<td><%= num %> X <%= i %> = <%= num*i %></td>
	</tr>
	</table>
<%		
	}
%>
</head>
<body>

</body>
</html>