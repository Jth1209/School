<%@page import="cart.cartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pid = request.getParameter("id");
	cartDAO dao = new cartDAO();
	int Quantity = dao.selectQuantity(Integer.parseInt(pid));
	if(Quantity <= 1){
		out.println("<script type='text/javascript'>");
        out.println("alert('한개 미만으로 설정할 수 없습니다.');");
        out.println("window.location.href = 'carts.jsp';");
        out.println("</script>");
	}else{
		dao.minusQuantity(Integer.parseInt(pid));
%>
	<jsp:forward page="carts.jsp"></jsp:forward>
<%
	}	
%>
