<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h2> pageContext 저장소 !!!</h2>

<% pageContext.setAttribute("str", "hello pageConext!!!"); %>
<% String str = (String) pageContext.getAttribute("str"); %>
<%= str%>
${str}


<h2>jsp에서만 사용되는 내장객체</h2>
<p>
  다른매서드에서 내장객체를 사용하려면 pageConext객체를 사용해야함 !!!
  스크립트릿과 표현식으로 작성한것은 모두  _jspService매서드에서 코드가 만들어지고 
  이 매서드안에서만 내장객체를 사용할 수 있다.
  jsp만의 특징
</p>
<%  pageContext.getRequest().getServletContext().getContextPath(); %>


</body>
</html>