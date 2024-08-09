<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Actions</th>
        </tr>
            <tr>
                <td>${pd.id}</td>
                <td>${pd.name}</td>
                <td>${pd.description}</td>
                <td>${pd.price}</td>
                <td>${pd.stock}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/products.jsp">홈으로</a>
                </td>
            </tr>
    </table>
</body>
</html>