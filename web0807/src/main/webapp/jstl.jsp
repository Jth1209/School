<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("name", "홍길동");
	request.setAttribute("money", 50000);
	request.setAttribute("dataList", new String[] {"a","b","c"});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${name == '홍길동'}">
	이름은 홍길동입니다.<br>
</c:if><!-- 조건문 문법 -->
<br><br>
<c:forEach var="count" begin="0" end="30" step="3">
	${count}
</c:forEach>
<br>
${sum = 0; ''}
<c:forEach var="i" begin="1" end="10">
	${sum = sum + i; ''}
</c:forEach>
<br>
${sum}
<br>
<br>
${num = 4; ''}
<ul>
<c:forEach var="dan" begin="1" end="9">
	${num} X ${dan} = ${num*dan}<br>
</c:forEach>
</ul>

<c:forEach var="data" items="${dataList}">
	${data}<br>
</c:forEach>
</body>
</html>