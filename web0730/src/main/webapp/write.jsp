<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<form method="post" action="insert.jsp">
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title1"  maxlength="80"
                       value="">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer1" maxlength="20"
                       value="">
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content1" rows="10"></textarea>
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>
</body>
</html>