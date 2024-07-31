
<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

LocalDateTime lc = LocalDateTime.now();//스레드 사용할 때 자주 사용함

String now = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(lc);




String num = request.getParameter("num");
String wtitle = request.getParameter("title1");
String wwriter = request.getParameter("writer1");
String wcontent = request.getParameter("content1");

BoardDAO dao = new BoardDAO();
BoardDTO dto = new BoardDTO(Integer.parseInt(num),wwriter,wtitle,wcontent,"",0);

dao.getUpdate(dto);//전달받은 값으로 업데이트

response.sendRedirect("list.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>