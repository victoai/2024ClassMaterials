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
 
  <form  action='<c:url  value="/basic"/>'  method="post">   
  	  <input type="text"  name="id" >    <span > ${errors.id}</span>
      <input type="text" name="pw"  >    <span > ${errors.pw}</span>     
   <button>로그인</button>
 </form> 
</body>
</html>