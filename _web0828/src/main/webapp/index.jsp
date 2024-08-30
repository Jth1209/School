<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection conn = null;

String sql = "select * from dept";

String URL = "jdbc:mysql://localhost:3307/spring5fs";
String id = "root";
String pw = "mysql";

Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, id, pw);
PreparedStatement pstmt = null;

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
<title>Insert title here</title>
</head>
<body>
<table border=1>
	<tr>
		<td class="num">부서 명</td>
		<td class="regtime">부서 이름</td>
		<td class="writer">부서 위치</td>
	</tr>
<%
	pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	
	while(rs.next()){
		String deptno = rs.getString("deptno");
		String dname = rs.getString("dname");
		String loc = rs.getString("loc");
%>
	<tr>
		<td><a href="javascript:callEmp(<%=deptno%>)"><%=deptno %></a></td>
		<td><%=dname %></td>
		<td><%=loc %></td>
	</tr>
<%
	}
%>		
</table>
<hr>
<div id="result"></div>
<script type="text/javascript">
	/*function callEmp(dn){
		const Url = "http://localhost:8080/_web0828/emp.jsp";
		
		const deptno = dn;
		
		fetch(`${Url}?deptno=${deptno}`,{
			.then(response => response.JSON());
			.then(data =>{
				const printdata = document.querySelector("#result");
				printdata = "";
				data.forEach(post => {
					printdata.innerHTML += 
				})
			})
		})
	}*/
	 function callEmp(deptno){
        const xhr= new XMLHttpRequest();
        xhr.open('get','emp.jsp?deptno='+deptno,true);
        xhr.send();
        //send
        xhr.onreadystatechange = function(){//위의 결과값을 받고나서 실행, 리스너같은 역할
            if(xhr.readyState === XMLHttpRequest.DONE){//이미 작업을 완료했다면,
                if(xhr.status === 200){//200은 정상적으로 전송됐음을 의미
                    document.getElementById('result').innerHTML = xhr.responseText;//전송받은 text값을 대입
                }else {
                    console.error('ERROR!');
                }
            }
        }
    }
</script>
</body>
</html>