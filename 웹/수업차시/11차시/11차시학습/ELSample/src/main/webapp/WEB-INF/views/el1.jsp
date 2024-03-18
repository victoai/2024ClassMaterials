<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> EL :  jsp가 기본적으로 제공하는 기능이다  </h2> 
<h2> 저장소에 담긴 내용들을 EL표현식으로 꺼내올 수 있다.</h2>


${10+20}  
<%   pageContext.setAttribute("key" ,"key연습"); %>
<% String key2 = (String) pageContext.getAttribute("key"); %>

<br>
<%=key2 %>

<h4> 저장소에서 값을 얻어온다음 출력하는 두 줄의 코드를 아래와 같이 하나로 작성할 수 있다.</h4>
${key} <br>


${10-20}
${10 % 3}
${10/3}

EL논리연산자
${true && true }
${true and false}
${true || false}
${true or false}
${not true}
 

EL 관계연산자  , 같다, 같지않다
${ 10 eq 11}  
 


<h2>empty</h2>
empty연산자
: null이면 true임
<br>
<% pageContext.setAttribute("title", "EL연산자");
%>
<br>
${empty title}  , ${empty  title2} <br>
${ not empty title}  , ${ not  empty  title2} <br>
조건연산자<br>
${ 10> 20 ? "크다" : "작다" }<br>
</body>
</html>