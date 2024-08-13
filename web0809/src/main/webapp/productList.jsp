<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <a href="${pageContext.request.contextPath}/registProduct.jsp">Add New Product</a>
    <a href="${pageContext.request.contextPath}/carts.jsp">show cart</a>
    <table border="2">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Actions</th>
            <th>Cart</th>
        </tr>
        <c:forEach var="product" items="${products}">
        	<form>
        		<input type="hidden" name="pname" value="${product.name }">
        	</form>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/viewProducts.jsp?id=${product.id}">View</a>
                    <a href="${pageContext.request.contextPath}/updateProducts.jsp?update=${product.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/deleteProducts.jsp?delete=${product.id}">Delete</a>
                </td>
                <td><button type="button" value="장바구니에 담기" onclick="location.href='inputCart.jsp?pid=${product.id }'">장바구니에 담기</button></td>
            </tr>
        </c:forEach>
    </table>
    <%
    request.removeAttribute("products");
    %>
</body>
</html>