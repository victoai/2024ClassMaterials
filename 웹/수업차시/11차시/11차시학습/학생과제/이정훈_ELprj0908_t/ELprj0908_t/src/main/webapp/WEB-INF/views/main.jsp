<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:choose>
	<c:when test="${empty id}">
		로그인하기
		<form action="/ELprj0908_t/ex9" method="get">
			<button>로그인</button>
		</form>
	</c:when>
	<c:when test="${not empty id}">
		로그아웃하기
		<form action="/ELprj0908_t/logout" method="get">
			<button>로그아웃</button>
		</form>
	</c:when>
</c:choose>

</body>
</html>