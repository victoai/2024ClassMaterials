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



<c:forEach var="item" items="${num}">

${item}<br>
</c:forEach>

<c:forEach var="item" begin="1" end="10">
${item}<br>
</c:forEach>



</body>
</html>