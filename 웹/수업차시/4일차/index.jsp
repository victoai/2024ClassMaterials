<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/index.css" rel="stylesheet" />
</head>
<body>
	<header>
		<img src="./img/cgv.jpg" />
	</header>
	<jsp:include page="nav.jsp"></jsp:include>


	<table>
	<caption><strong>상영 영화 리스트</strong></caption>
		<tr>			
			<td>영화코드</td>
			<td>영화제목</td>
			<td>장르</td>
			<td>런타임</td>
			<td>상영시간</td>
			<td>티켓가격</td> 
		</tr>
	 
	</table>
	<jsp:include page="section.jsp"></jsp:include>
	
</body>
</html>

