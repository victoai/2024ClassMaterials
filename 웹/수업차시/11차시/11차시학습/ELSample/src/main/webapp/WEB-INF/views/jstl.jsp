<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
  ArrayList<String> list = new ArrayList<String>();
  list.add("one");
  list.add("two");
  list.add("three");
  //pageContext.setAttribute("list", list );
%>

<table>
<tr>
<td>순서</td>
<td>내용</td>
</tr>


<c:set var="list"  value="<%=list%>"> </c:set>

<c:forEach var="item"  items="${list}" varStatus ="st">
<tr>
 <td> ${st.count }</td>
 <td> ${item}</td>
 </tr>
</c:forEach>
</table>

 <hr>
 <h2>기존방식</h2>

<table>
<tr>
<td>순서</td>
<td>내용</td>
</tr>
 

 <% for( int i=0; i< list.size();i++) {
	 String s  = list.get(i); 
 %>
 
<tr>
 <td>  <%= i+1 %>  </td>
 <td>  <%= s %></td>
 </tr>
 <%} %>
</table>
</body>
</html>