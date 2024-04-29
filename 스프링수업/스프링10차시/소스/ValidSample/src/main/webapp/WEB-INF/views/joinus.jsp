<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form  action="/validex/joinus"  method="post">
<input type="text" name="id"> <br>
<input type="text" name="pw"> <br>
<input type="text" name="birth"> <br>
<button>가입</button>


<h2> 아래로 변경 </h2>

 <form:form modelAttribute="user"> 
     <input type="text" name="id" />   <form:errors path="id"/>   <br>
     <input type="text" name="pw"/>    <form:errors path="pw"/>    <br>
     <input type="text" name="birth"/> <form:errors path="birth"/>   <br>        
  <button>로그인</button>
</form:form>

</form>
</body>
</html>