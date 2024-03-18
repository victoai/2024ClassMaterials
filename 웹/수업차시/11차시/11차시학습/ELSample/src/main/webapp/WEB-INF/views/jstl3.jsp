<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>





<ul>
<li>c:set 사용해 보기 : 저장소에 변수의 내용저장하기  </li>
<li>c:out 사용해 보기 : 저장소에 변수의 값 출력하기(응답 )</li>
</ul>



<h3> 저장소에 변수를 저장하는 이유?   저장소에 저장된것만이   EL문법을 사용할 수 있다.</h3>
<p> 개발시 EL을 쓰고 싶을 때 변수를 저장소에 저장하고 사용할 수 있다.</p>


<h3>  cout 출력하기  vs  el로  출력하는것의 차이 !!! </h3>

<% String str = "<script> alert('실행됨!! ');</script>"; %>
<c:set var="strp" value="<%=str %>"></c:set>
<c:out value="${strp}"></c:out> 
${strp}
 
 <h3> 저장소에 변수값 저장하기 - 보통  EL을 사용하기 위해서 사용됨</h3>
 <c:set var="str1"  value="hello 변수를 저장소에 저장했어요"/>
 ${str1}
 
 <h2> c:out 이스케이핑 자동적으로 해 준다: </h2>
< : &lt;
> : &gt;
& : &amp;
" : &quot;
 
 <p> 다음을  이스케이핑 하면 다음과 같다 </p>
 "Hello <World>"   ==> <br>
  Hello &lt;World&gt;
 
  
</body>
</html>