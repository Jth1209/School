<%@page import="cart.cartDTO"%>
<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String pid = request.getParameter("pid");
	cartDAO dao = new cartDAO();
	if(dao.check(Integer.parseInt(pid)) != 1){
		cartDTO dto = new cartDTO(0,Integer.parseInt(pid),1);
		dao.insertCart(dto);
	}else{
		dao.plusQuantity(Integer.parseInt(pid));
	}
%>
<jsp:forward page="products.jsp"></jsp:forward>