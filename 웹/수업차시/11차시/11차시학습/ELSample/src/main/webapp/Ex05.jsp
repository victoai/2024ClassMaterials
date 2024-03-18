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

<h2>3단 출력하기</h2>


<c:forEach var="i" begin="1"  end="9">
  <p> ${i*3} </p>
</c:forEach>


</body>
</html>