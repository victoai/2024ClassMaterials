<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title> </title>
</head>
<body>
    <%-- 임의로 점수 값 --%>
    <c:set var="kor" value="60" />
    
    <h2>주의 사항 !! ==>EL 표현을 사용하려면 저장소에 저장되어야 함 </h2>
    
    <%-- 등급을 계산하고 출력   --%>
    <%-- 등급 기준은 A: 90 이상, B: 80 이상, C: 70 이상, F: 70 미만 입니다. --%>
    <c:choose>
        <c:when test="${kor >= 90}">
            <p>시험성적: A</p>
        </c:when>
        <c:when test="${kor >= 80}">
            <p>시험성적: B</p>
        </c:when>
        <c:when test="${kor >= 70}">
            <p>시험성적: C</p>
        </c:when>
        <c:otherwise>
            <p>시험성적: F</p>
        </c:otherwise>
    </c:choose>
    
    
</body>
</html>
