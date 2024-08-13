<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	cartDAO dao = new cartDAO();
	dao.deleteAll();
%>
<jsp:forward page="carts.jsp"></jsp:forward>