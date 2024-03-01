<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>El param</h3>
<p>요청시 param value 값 얻어올 떄 사용</p>
 ${param.id}
 
 
 <h3>El param 사용안할경우</h3> 
 <% String id2= request.getParameter("id"); %>
 <%=id2 %>

</body>
</html>