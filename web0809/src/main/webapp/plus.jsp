<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pid = request.getParameter("id");
	cartDAO dao = new cartDAO();
	int stock = dao.selectStock(Integer.parseInt(pid));
	int quantity = dao.selectQuantity(Integer.parseInt(pid));
	if(quantity >= stock){
		out.println("<script type='text/javascript'>");
        out.println("alert('재고보다 많은 양을 선택할 수 없습니다');");
        out.println("window.location.href = 'carts.jsp';");
        out.println("</script>");
	}else{
		dao.plusQuantity(Integer.parseInt(pid));
%>
		<jsp:forward page="carts.jsp"></jsp:forward>
<% 
	}
%>
