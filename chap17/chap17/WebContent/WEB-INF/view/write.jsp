<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="mvjsp.chap17.board.service.WriteArticleService"%>
<%@ page import="mvjsp.chap17.board.model.Article"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>�Խñ� �ۼ�</title>
</head>
<body>
	�Խñ��� ����߽��ϴ�.
	<br />
	<a href="list.do">��Ϻ���</a>
	<a href="read.do?articleId=${postedArticle.id}">�Խñ�
		�б�</a>
</body>
</html>
