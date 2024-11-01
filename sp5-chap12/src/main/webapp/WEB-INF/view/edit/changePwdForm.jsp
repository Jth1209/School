<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="change.pwd.title" /></title>
</head>
<body>
	<form:form modelAttribute="command">
		<form:errors />
		<p>
			<label><spring:message code="currentPassword" />:<br> <form:input
					path="currentPassword" /> <form:errors path="currentPassword" /> </label>
		</p>
		<p>
			<label><spring:message code="newPassword" />:<br> <form:input
					path="newPassword" /> <form:errors path="newPassword" /> </label>
		</p>
		<input type="submit" value="<spring:message code="change.btn"/>">
	</form:form>
</body>
</html>
