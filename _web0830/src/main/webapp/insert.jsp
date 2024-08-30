<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="empJsonserver1.jsp" method="post">
		<input type="hidden" name="action" value="create"/>
		ename:<input type="text" name="name" placeholder="이름"/><br>
		job:<input type="text" name="job" placeholder="직무"/><br>
		manager:<input type="text" name="manager" placeholder="상사"/><br>
		hireDate:<input type="text" name="hireDate" placeholder="입사날짜"/><br>
		salary:<input type="text" name="salary" placeholder="월급"/><br>
		commission:<input type="text" name="commission" placeholder="보너스"/><br>
		deptId:<input type="text" name="deptId" placeholder="부서번호"/><br>
		<button type="submit">저장</button>
	</form>
</body>
</html>