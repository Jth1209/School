<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Product_ID</th>
            <th>NAME</th>
            <th>DESCRIPTION</th>
            <th>PRICE</th>
            <th>STOCK</th>
            <th>Quantity</th>
            <th>Options</th>            
        </tr>
        <c:forEach var="cart" items="${cart}">
            <tr>
                <td>${cart.id}</td>
                <td>${cart.pid}</td>
                <td>${cart.name}</td>
                <td>${cart.description}</td>
                <td>${cart.price}</td>
                <td>${cart.stock}</td>
                <td>${cart.quantity}</td>
               
                <td>
                    <button type="button" onclick="location.href='plus.jsp?id=${cart.id}'">+</button>
                    <button type="button" onclick="location.href='minus.jsp?id=${cart.id}'">-</button>
                    <button type="button" onclick="location.href='deleteCart.jsp?delete=${cart.id}'">Delete</button>
                </td>
            </tr>
        </c:forEach>
        <button type="button" onclick="location.href='products.jsp'">back</button>
        <button type="button" onclick="location.href='deleteAll.jsp'">Delete All</button>
    </table>
    <%
    request.removeAttribute("products");
    %>
</body>
</html>