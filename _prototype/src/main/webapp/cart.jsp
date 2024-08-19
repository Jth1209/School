<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>홈페이지</title>
<link rel="icon" href="img/aespa.ico?after" type="image/x-icon">
<link rel="stylesheet" href="css/style2.css?after">
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
                <li><a href="check?identify=2">자료실</a></li>
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
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<section>
	<div class="container" style="padding-top: 50;">
		<button type="button" class="btn btn-outline-primary"
			onclick="location.href='shop'">상품목록으로 돌아가기</button>
		<table class="table table-bordered table-hover">
			<tr>
				<th class="num">카트번호</th>
				<th class="title">상품번호</th>
				<th class="writer">품명</th>
				<th class="regtime">설명</th>
				<th>가격</th>
				<th>재고</th>
				<th>담은 수량</th>
				<th>기능</th>
			</tr>

			<c:forEach var="cart" items="${cart}">
				<tr>
					<td>${cart.id}</td>
					<td>${cart.product_id }</td>
					<td>${cart.name}</td>
					<td>${cart.description}</td>
					<td>${cart.price}</td>
					<td>${cart.stock}</td>
					<td>${cart.quantity}</td>
					<td><button type="button" class="btn btn-outline-primary"
							onclick="location.href='plus?id=${cart.id}'">+</button>
						<button type="button" class="btn btn-outline-primary"
							onclick="location.href='minus?id=${cart.id}'">-</button>
						<button type="button" class="btn btn-outline-danger"
							onclick="location.href='deleteC?id=${cart.id}'">삭제</button></td>
				</tr>
			</c:forEach>
		</table>
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