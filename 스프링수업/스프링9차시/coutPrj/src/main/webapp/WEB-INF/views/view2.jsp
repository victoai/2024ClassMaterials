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

<!--  <script > alert("ok");  </script> -->
<!--  escapeXml="true" 기본값 -->
<c:out value="${data}"  escapeXml="true"/> 

<!--   

escapeXml="true"는 <c:out> 태그의 속성 중 하나로,
 XML 특수 문자를 이스케이프(escape)하여 HTML/XML 코드로 해석되지 않고 일반 텍스트로 출력되도록 한다
 이는 보안상의 이유로 XSS 공격을 방지하기 위해 사용 
 
 "Escape"는 보통 특정 문자나 문자열을 다른 형태로 변환하는 것을 의미 
  보안 관련 문맥에서는 주로 특수 문자를 해당 문자의 문자열 표현 혹은 이스케이프 문자와 함께 변환하는 것을 의미 .

아래와 같이 false도 사용할 수 있다
EL을 사용하는 것과 동일한 결과가 나온다.
 <c:out value="${data}"  escapeXml="false"/> 
 
 -->
</body>
</html>