<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = (String)session.getAttribute("name");

%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MLC</title>
    <link rel="icon" href="mang.png" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
</head>

<body>

    <header>
        <div class="inner">
        	
            <h1><a href="https://namu.wiki/w/%EB%A7%A8%EC%B2%B4%EC%8A%A4%ED%84%B0%20%EC%9C%A0%EB%82%98%EC%9D%B4%ED%8B%B0%EB%93%9C%20FC?from=%EB%A7%A8%EC%B2%B4%EC%8A%A4%ED%84%B0%20%EC%9C%A0%EB%82%98%EC%9D%B4%ED%8B%B0%EB%93%9C">MLC HomePage</a></h1>

            <ul id="gnb">
                <li><a href="https://www.manutd.com/ko">GALLERY</a></li>
                <li><a href="https://www.youtube.com/@manutd">YOUTUBE</a></li>
                <li><a href="newlist.jsp">게시판</a></li>
                <li><a href="https://www.manutd.com/en/visit-old-trafford/museum-stadium-tours?t=y&utm_source=google&utm_medium=cpc&utm_campaign=museum&gad_source=1&gclid=EAIaIQobChMIiq3A0obdhwMVJOMWBR3uZA6wEAAYASAAEgJc1_D_BwE">LOCATION</a></li>
            </ul>

            <ul class="util">
             	<%
             		if(name != null){
             	%>
             	<li><a href="#"><%= name %>님</a></li>
             	<% 		
             		}else{
             	%>
             	<li><a></a></li>
             	<% 
             		}
             	%>
             	<%
             		if(name != null){
             	%>
             	<li><a href="logout.jsp">Logout</a></li>
             	<% 		
             		}else{
             	%>
                <li><a href="login.jsp">Login</a></li>
             	<% 
             		}
             	%>
             	<%
             		if(name != null){
             	%>
             	<li><a href="userInfo.jsp">정보수정</a></li>
             	<% 		
             		}else{
             	%>
                <li><a href="register.jsp">Join</a></li>
             	<% 
             		}
             	%>
            </ul>
        </div>
    </header>
    <figure>
        <img src="img/final.jpg">
        <div class="inner">
            <h1>ManChester UTD</h1>
            <p>ManChester United Slogun<br>
                Concilio et Labore</p>
        </div>
    </figure>

    <section>
        <div class="inner">
            <h1>명예의 전당</h1>
            <div class="wrap">
                <article>
                    <div class="pic">
                        <img src="img/siu.jpg" alt="1ë²ì§¸ ì½íì¸  ì´ë¯¸ì§">
                    </div>
                    <h2><a href="https://namu.wiki/w/%ED%81%AC%EB%A6%AC%EC%8A%A4%ED%8B%B0%EC%95%84%EB%88%84%20%ED%98%B8%EB%82%A0%EB%91%90?from=%ED%98%B8%EB%82%A0%EB%91%90">Cristiano Ronaldo</a></h2>
                    <p>2003~2007 / No.7</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/boby.jpg" alt="2ë²ì§¸ ì½íì¸  ì´ë¯¸ì§">
                    </div>
                    <h2><a href="https://namu.wiki/w/%EB%B0%94%EB%B9%84%20%EC%B0%B0%ED%8A%BC">Sir. Bobby Charlton</a></h2>
                    <p>1968~1973 / No.7 No.9 No.10</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/best.jpg" alt="3ë²ì§¸ ì½íì¸  ì´ë¯¸ì§">
                    </div>
                    <h2><a href="https://namu.wiki/w/%EC%A1%B0%EC%A7%80%20%EB%B2%A0%EC%8A%A4%ED%8A%B8">George Best</a></h2>
                    <p>1961~1963 / No.7</p>
                </article>

                <article>
                    <div class="pic">
                        <img src="img/eric.jpg" alt="4ë²ì§¸ ì½íì¸  ì´ë¯¸ì§">
                    </div>
                    <h2><a href="https://namu.wiki/w/%EC%97%90%EB%A6%AD%20%EC%B9%B8%ED%86%A0%EB%82%98">Éric Cantona</a></h2>
                    <p>1992~1997 / No.7</p>
                </article>
            </div>
        </div>
    </section>

    <footer>
        <div class="inner">
            <div class="upper">
                <h1>MLC HomePage</h1>
                <ul>
                    <li><a href="https://namu.wiki/w/%EB%82%98%EB%AC%B4%EC%9C%84%ED%82%A4:%EB%8C%80%EB%AC%B8">제작지원: namuwiki</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    맨체스터 유나이티드를 사랑하는 사람들이 모여있는 홈페이지입니다.<br>
                </address>
                <p>
                    2024 MLC &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>
</body>
</html>