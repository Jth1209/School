
<%@page import="board.BoardDAO"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");


LocalDateTime lc = LocalDateTime.now();//스레드 사용할 때 자주 사용함

String now = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(lc);

String delete = request.getParameter("num");

String sqlTmp = "";

BoardDAO dao = new BoardDAO();

dao.getDelete(delete);//넘겨받은 num으로 해당 정보 삭제

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