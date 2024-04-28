<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <!-- 
 
  <form  action='<c:url  value="/nonAuto"/>'  method="post">   
  	  <input type="text"  name="id" >   
      <input type="text" name="pw"  >    
      <input type="text" name="birth" >     
   <button>로그인</button>
 </form>
 
 -->
 
   <form:form modelAttribute="myData"> 
      <input type="text" name="id" />   <form:errors path="id"/>   <br>
      <input type="text" name="pw"/>    <form:errors path="pw"/>    <br>
      <input type="text" name="birth"/> <form:errors path="birth"/>   <br>     
   <button>로그인</button>
 </form:form>
</body>
</html>