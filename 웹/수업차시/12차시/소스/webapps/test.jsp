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


<c:set var="counter" value="0" />
<c:set var="maxCount" value="10" />

<c:forEach var="i" begin="1" end="${maxCount}">
    <!-- 반복하려는 내용을 여기에 추가합니다 -->
    현재 반복 횟수: ${i} <br/>
    
    <!-- 원하는 조건에 따라 반복을 중단하려면 다음과 같이 사용합니다 -->
  
    
    <!-- 반복 카운터를 증가시킵니다 -->
    <c:set var="counter" value="${counter + 1}" />
</c:forEach>

값 확인
${counter}

</body>
</html>