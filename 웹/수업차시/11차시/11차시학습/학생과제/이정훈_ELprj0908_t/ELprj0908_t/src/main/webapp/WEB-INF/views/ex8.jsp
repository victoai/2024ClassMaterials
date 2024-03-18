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


<table>
	<tr>
		<td>상품코드</td>
		<td>커피이름</td>
		<td>가격</td>
	</tr>
	<c:forEach var="item" items="${coffee}">
	<tr>
		<td>${item.code}</td>
		<td>${item.name}</td>
		<td>${item.price}</td>
	</tr>
	</c:forEach>
</table>


</body>
</html>