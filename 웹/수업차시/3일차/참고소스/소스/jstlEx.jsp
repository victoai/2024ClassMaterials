<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:set var="su" value="33444"/>
	<fmt:formatNumber  value="${su}"/> 	
	<h2> 배열내용 출력하기</h2>	
	 
	<c:set var="msg">apple, banana, orange, kiwi</c:set>
	<c:forEach var="item" items="${msg}">
	<c:out value="${item}"></c:out> 
</c:forEach>

<%
String[] message ={"사과" ,"망고"};
request.setAttribute("message", message);
%>

 
 ${pageContext.request.contextPath}
 
 <h2>contextpath</h2>
 <% String contextpath   = application.getContextPath();
    out.println( contextpath);
 %>
 
 <h2> el</h2>
 <c:set var="path" value="contextpath" />
 ${path}
 
 
 <h2> contextPath1</h2>
 <c:set var="contextPath1" value="<%= request.getContextPath()%>" />
 ${contextPath1 }
  <h2> contextPath2</h2>
 <c:set var="contextPath2" value="${pageContext.request.contextPath}" />
  ${contextPath2 }
 
  
  
 
 ${contextpath}

<c:forEach var="item" items="${message}"> 
 <c:out value="${item}"></c:out>
</c:forEach>




</body>
</html>