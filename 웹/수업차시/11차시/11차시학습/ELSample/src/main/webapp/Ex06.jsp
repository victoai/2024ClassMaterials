<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title> </title>
</head>
<body>

<h2>전체구구단 출력하기</h2>
    <c:forEach var="i" begin="1" end="9">
        <c:forEach var="j" begin="1" end="9">
            <p>${i} * ${j} = ${i*j}</p>
        </c:forEach>
    </c:forEach>
</body>
</html>
