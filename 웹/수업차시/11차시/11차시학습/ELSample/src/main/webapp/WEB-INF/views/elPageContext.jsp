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

 <h2> pageContext 저장소는 jsp페이지 하나당 제공되는 저장소 : 여기에 저장을 하는 이유는 EL을 사용하기 위한 목적이다</h2>
 <h2> JSP내에서 선언한 변수를 EL을 통해서 사용하고 싶을 때 사용한다</h2>



  <h3>JSTL과 EL사용하지 않는 코드===================</h3>

  <% String str ="EL좋아요" ; 
    out.println(str);
   %> 
   
      
    <%if( str.equals("EL좋아요")){ %>        
       <div> 맞아요 EL정말 좋아요 !!  1</div>        
   <%} %>
   
   
   
    <h3>JSTL과 EL사용하는 코드===================</h3>
   <% pageContext.setAttribute("strp", "EL좋아요") ;%>
   
   
   <!--  c:set으로 변수를 선언하면 pageContext 저장소에 담긴다. 그래서 EL을 사용할 수 있다. -->
   <c:set var="strpp"  value="EL좋아요" />

  
   
   <h3> JSTL에서 EL을 함께 사용함 </h3>   
   <c:if test="${ strp eq  'EL좋아요' }">   <div> 맞아요 EL정말 좋아요 !! 2</div>   </c:if>
   <c:if test="${ strpp eq  'EL좋아요' }">   <div>  맞아요 EL정말 좋아요 !! 3</div>   </c:if>
    
   
   
   
</body>
</html>