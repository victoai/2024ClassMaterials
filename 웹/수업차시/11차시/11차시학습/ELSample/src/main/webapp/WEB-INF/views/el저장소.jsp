<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 저장소 : pageContext(jsp만 존재함)  -> request (HttpServletReqeust) -> session (HttpSession) ->application (ServletContext)</h2>

<%  
 pageContext.setAttribute("test", "test_page");
 request.setAttribute("test", "test_request");
 session.setAttribute("test", "test_session");
 application.setAttribute("test", "test_application");
 
%>

<p>
${ test}
<p>
${ pageScope.test}
<p>
${ requestScope.test}
<p>
${ sessionScope.test}
<p>
${ applicationScope.test}
</body>
</html>