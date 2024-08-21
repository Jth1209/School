<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>홈페이지</title>
<link rel="icon" href="img/aespa.ico?after" type="image/x-icon">
<link rel="stylesheet" href="css/style.css?after">
<script src="js/ie.js"></script>
</head>

<body>
    <header>
        <div class="inner">
            <h1><a href="index.jsp">æspa</a></h1>
            <ul id="gnb">
                <li><a href="https://blip.kr/artists/aespa/gallery">GALLERY</a></li>
                <li><a href="https://www.youtube.com/@aespa">YOUTUBE</a></li>
                <li><a href="check?identify=1">COMMUNITY</a></li>
                <li><a href="check?identify=2">UPLOAD</a></li>
                <li><a href="check?identify=3">GOODS</a></li>
            </ul>

            <ul class="util">
            <%
        		if(session.getAttribute("uname") != null){
        	%>
            	<li><a href=#>${uname }님</a></li>
            	<li><a href="update">회원정보 수정</a></li>
                <li><a href="logoutProcess">로그아웃</a></li>
                <li><a href="delete">회원삭제</a></li>
                
            <% 		
            	}else{
            %>
                <li><a href="login">로그인</a></li>
                <li><a href="register">회원가입</a></li>
            <%		
            	}
            %>
            </ul>
        </div>
    </header>
    <section>
		<div class="container">
        <h2>회원 가입</h2>
        <form action="registerProcess" method="post">
            <label for="username">아이디:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">비밀번호:</label>
            <input type="text" id="password" name="password" required>
            <label for="email">별명:</label>
            <input type="text" id="email" name="name" required>
            <input type="submit" value="Register">
        </form>
    </div>
		
    </section>
    <footer>
        <div class="inner">
            <div class="upper">
                <h1>æspa</h1>
                <ul>
                    <li><a href="https://m.cafe.daum.net/dafdgds/_rec">Family Site</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    컴퓨터 소프트웨어학과 장태호<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2024 æspa &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
</body>
</html>