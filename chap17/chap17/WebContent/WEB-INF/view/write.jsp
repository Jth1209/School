<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="mvjsp.chap17.board.service.WriteArticleService"%>
<%@ page import="mvjsp.chap17.board.model.Article"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>게시글 작성</title>
</head>
<body>
	게시글을 등록했습니다.
	<br />
	<a href="list.do">목록보기</a>
	<a href="read.do?articleId=${postedArticle.id}">게시글
		읽기</a>
</body>
</html>
