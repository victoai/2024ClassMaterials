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


<c:forEach var="i" begin="1" end="9">
	${i}단 <br>
	<c:forEach var="j" begin="1" end="9">
		${i} X ${j} = ${i*j}<br>
	</c:forEach>

</c:forEach>


</body>
</html>