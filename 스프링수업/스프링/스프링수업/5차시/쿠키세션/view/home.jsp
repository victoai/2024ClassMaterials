<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
  Home 
</h1>
 


<a href="<c:url value='/login/login2' />"> logiN</a>
<a href="<c:url value='/login/logOut'/>">lotOut</a>
<a href="<c:url value='/board/list' />"> board</a>
 
 <h2>  login / loginOut  </h2>

<c:set var="loginOutLink" value="${sessionScope.sessionId == null? '/login/login2' : '/login/logOut'}" />
<c:set var="loginOut" value="${ sessionScope.sessionId==null ? 'Login' : 'LogOut'}" />
<a href="<c:url value='${loginOutLink}' />"> ${loginOut} </a>
 
</body>
</html>
