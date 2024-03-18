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



<h2> jstl에서 변수선언 방법 c:set사용 </h2>

<p> c:set 변수선언시  pageContext 저장소에 저장해 줌 </p>
<c:set var="kor" value="90" />
<c:if test="${kor ==90 }"> 점수가 좋네요 !</c:if>


</body>
</html>