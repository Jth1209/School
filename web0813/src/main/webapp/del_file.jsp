<%@page import="file.fileDTO"%>
<%@page import="file.fileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.File" %>
    
<% 
    int num = Integer.parseInt(request.getParameter("num"));
	
	fileDAO dao = new fileDAO();
	fileDTO dto = dao.selectFile(num);
	if (dto != null) {

        // 지정된 파일 삭제
        File file = new File(application.getRealPath("/files/") +
                             dto.getFname());
        if (file != null) {
            file.delete();
        }
        dao.deleteFile(num);  
%>
	<jsp:forward page="webhardProcess.jsp"></jsp:forward>
<% 
    }else{
    	out.println("<script type='text/javascript'>");
        out.println("alert('해당 파일이 존재하지 않습니다.');");
        out.println("window.location.href = 'webhardProcess.jsp';");
        out.println("</script>");
    }
%>
