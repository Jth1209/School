<%@page import="file.fileDTO"%>
<%@page import="java.util.List"%>
<%@page import="file.fileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	fileDAO dao = new fileDAO();
	List<fileDTO> dto = dao.selectAll();
	request.setAttribute("files", dto);
%>
<jsp:forward page="webhard.jsp"></jsp:forward>