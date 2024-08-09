<%@page import="product.Product"%>
<%@page import="product.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
ProductDAO dao = new ProductDAO();
Product pd = dao.getProductById(Integer.parseInt(id));
request.setAttribute("pd", pd);
%>
<jsp:forward page="view.jsp"></jsp:forward>
