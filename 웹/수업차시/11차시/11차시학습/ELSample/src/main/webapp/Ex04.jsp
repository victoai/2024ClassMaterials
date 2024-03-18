<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title> </title>
</head>
<body>
    <% String[]  fruits={ "딸기" , "사과"}; %>
    <c:set var="list" value="<%=fruits%>" /> 
    
    
    <c:forEach var="item" items="${list}">
    	<p>${item}</p>
    </c:forEach>    
    
</body>
</html>
