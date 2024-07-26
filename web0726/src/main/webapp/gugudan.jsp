<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<h1>구구단 출력</h1>
<form method = "post" action = "gugudanResult.jsp">
구구단 입력 : <input name = "dan">단<p/><%-- <p/>는 단어를 끝맺고 한칸 내려쓰기 해주는 태그인듯? --%>
<input type = "submit" value = "보내기">
</form>
</body>
</html>