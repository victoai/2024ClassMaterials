<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page import="java.net.URLDecoder" %>

<%@ page import="aa.bb.zz.MyData" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <!--   
 <form:form modelAttribute="myData"> 
      <form:input path="id" />   <form:errors path="id"/>   <br>
      <form:input path="pw"/>    <form:errors path="pw"/>    <br>
      <form:input path="birth"/> <form:errors path="birth"/>   <br>     
   <button>로그인</button>
 </form:form>
 
 -->
 
  <form:form modelAttribute="myData"> 
      <input type="text" name="id" />   <form:errors path="id"/>   <br>
      <input type="text" name="pw"/>    <form:errors path="pw"/>    <br>
      <input type="text" name="birth"/> <form:errors path="birth"/>   <br>     
   <button>로그인</button>
 </form:form>
</body>
</html>