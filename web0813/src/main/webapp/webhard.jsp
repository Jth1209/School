<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table  { width: 700px; text-align: center; }
        th     { background-color: cyan; }
        
        .left  { text-align: left;  }        
        .right { text-align: right; }

        a:link  { text-decoration: none; color: blue; }
        a:hover { text-decoration: none; color: red;  }
    </style>    
</head>
<body>

<form action="add_file.jsp" enctype="multipart/form-data" method="post">
    업로드할 파일을 선택하세요.<br>
    <input type="file" name="upload"><br>
    <input type="submit" value="업로드">
</form>
<br>

<table>
    <tr>
        <th>파일명     </th>
        <th>업로드 시간</th>
        <th>크기       </th>
        <th>삭제       </th>
    </tr>
    <c:forEach var="files" items="${files}">
        <tr>
            <td class="left">
                <a href="files/${files.fname }">
                    ${files.fname }
                </a>
            </td>
            <td>${files.ftime }</td>
            <td class="right">${files.fsize }&nbsp;&nbsp;</td>
            <td><a href="del_file.jsp?num=${files.num }">X</a></td>
        </tr> 
    </c:forEach>
</table>

</body>
</html>
