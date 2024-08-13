<%@page import="product.Product"%>
<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String id = request.getParameter("update");
	request.setAttribute("id", id);
	ProductDAO dao = new ProductDAO();
	Product p = dao.getProductById(Integer.parseInt(id));
%>
<html>
<head>
<meta charset="UTF-8">
<title>Update Form</title>
</head>
<body>

	<form action="Update.jsp" method="post">
		<input type = "hidden" name = "id" value = "${id}" >
		<div>
			<label for="name">제품명:</label> <input type="text" id="name"
				name="name" value="<%=p.getName() %>" required>
		</div>
		<div>
			<label for="description">설명:</label>
			<textarea id="description" name="description" required><%=p.getDescription() %></textarea>
		</div>
		<div>
			<label for="price">가격:</label> <input type="text" id="price"
				name="price" value="<%=p.getPrice() %>" required>
		</div>
		<div>
			<label for="stock">수량:</label> <input type="text" id="stock"
				name="stock" value="<%=p.getStock() %>" required>
		</div>
		<div>
			<input type="submit" value="update Product">
		</div>
	</form>
</body>
</html>
