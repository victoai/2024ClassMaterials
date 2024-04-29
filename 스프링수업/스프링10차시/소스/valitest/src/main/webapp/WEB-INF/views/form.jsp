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

 
 
 <!--  myData 객체에 바인딩한다 -->
  
  <form:form modelAttribute="myData"> 
      <input type="text" name="id" />   <form:errors path="id"/>   <br>
      <input type="text" name="pw"/>    <form:errors path="pw"/>    <br>
      <input type="text" name="birth"/> <form:errors path="birth"/>   <br>        
   <button>로그인</button>
 </form:form>
 
 
 <!--  
  <form id="myData" action="/zz/t" method="post"> 
      <input type="text" name="id" />    <span id="id.errors">아이디는  5 ~ 12 자리여야 합니다</span>   <br>
      <input type="text" name="pw"/>        <br>
      <input type="text" name="birth"/> <span id="birth.errors">날짜형식 yyyy/mm/dd해 주세요</span>   <br>     
   <button>로그인</button>
 </form>
 -->
 
 
</body>
</html>