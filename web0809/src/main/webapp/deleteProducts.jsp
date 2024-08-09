<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String delete = request.getParameter("delete");
	ProductDAO dao = new ProductDAO();
	dao.deleteProduct(Integer.parseInt(delete));
%>
<jsp:forward page="products.jsp"/>
