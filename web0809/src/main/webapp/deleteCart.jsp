<%@page import="cart.cartpDTO"%>
<%@page import="java.util.List"%>
<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("delete");
	cartDAO dao = new cartDAO();
	dao.deleteCart(Integer.parseInt(id));
%>
<jsp:forward page="carts.jsp"></jsp:forward>
