<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="java.util.*" %>
<%@ page import="front.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>:

<% ArrayList<Member>  list= (ArrayList<Member> )request.getAttribute("members"); %>

 
 
 
 <%
      for( Member m : list) {  
           out.println( m); 
      }
 
 %>
</html>