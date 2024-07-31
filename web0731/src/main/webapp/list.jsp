<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("UTF-8");
LocalDateTime lc = LocalDateTime.now();//스레드 사용할 때 자주 사용함

String now = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(lc);

String sqlTmp = "";
String num = "";
String writer = "";
String title = "";
String content = "";
String regtime = "";
String hits = "";

//-------------------------------------------------작성자 정보

String wnum = request.getParameter("find");

/*if(wnum != null){
	sqlTmp = "update board set title = ?, writer = ?, content = ?, regtime= ?, hits = 0 where num = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1,wtitle);
	pstmt.setString(2,wwriter);
	pstmt.setString(3,wcontent);
	pstmt.setString(4,now);
	pstmt.setString(5,wnum);
	pstmt.executeUpdate();
}*/
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>
<input type = "hidden" name="addhit">
<table>
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
<%
BoardDAO dao = new BoardDAO();
List<BoardDTO> list = dao.getBoardList();

for(BoardDTO dto : list){
	num = String.valueOf(dto.getNum());
%>
    <tr>
        <td><%=dto.getNum() %></td>
        <td style="text-align:left;">
            <a href="view.jsp?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a>
            <input type = "hidden" name = "addhit" value = "<%=dto.getNum() %>">
        </td>
        <td><%=dto.getWriter() %></td>
        <td><%=dto.getRegtime() %></td>
        <td><%=dto.getHits() %></td>
    </tr>
<%
}
%>
</table>
<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">

</body>
</html>