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



 <h2> 1~10까지 출력하기</h2> 
 
<c:forEach var="cnt" begin="1" end="10">
	<c:out value="${cnt}"/><br/> 	
</c:forEach> 

</body>
</html>