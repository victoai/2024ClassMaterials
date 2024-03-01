<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import ="java.util.ArrayList" %>
<%@ page import ="acorn.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 
</head>
<body>

<h2>에이콘 학생리스트</h2>

<c:set var="path"  value="<%=request.getContextPath()%>" />

 <img src="${path}/css/acorn.jpg" >
 
 <table>

<tr>
<td></td>
<td></td>
<td></td>
</tr>
 
 <c:forEach var="item"  items="${list}"> 
 <tr>
  <td>${item.id} </td>
  <td>${item.pw} </td>
  <td>${item.name} </td>
  </tr>
 </c:forEach>

 </table>
</body>
</html>