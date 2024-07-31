<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");



String lnum = request.getParameter("num");

BoardDAO dao = new BoardDAO();

//dao.getHits(lnum);//조회수

BoardDTO dto = dao.getOne(lnum);//선택한 내용들 출력
%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<form method="post" action="update.jsp">
	<input type="hidden" name = "num" value = "<%=lnum %>"><%--숨겨진 변수 다른 웹페이지에서 매개변수로 활용 --%>
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title1"  maxlength="80"
                       value="<%=dto.getTitle() %>">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer1" maxlength="20"
                       value="<%=dto.getWriter() %>">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content1" rows="10"><%=dto.getContent() %></textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>
</body>
</html>