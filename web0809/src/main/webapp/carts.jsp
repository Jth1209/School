<%@page import="cart.cartpDTO"%>
<%@page import="cart.cartDTO"%>
<%@page import="java.util.List"%>
<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	cartDAO dao = new cartDAO();
	List<cartpDTO> dto = dao.showCart();
	request.setAttribute("cart", dto);
%>
<jsp:forward page="cartView.jsp"></jsp:forward>