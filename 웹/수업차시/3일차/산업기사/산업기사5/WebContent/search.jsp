<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table{
border:1px solid black;
margin:0 auto;
border-collapse: collapse;
}
td{
border:1px solid black;
}
</style>
</head>
<body>


<table>
<tr>
<td>아이디</td>
<td>비번</td>
<td>이름</td>
<td>변경/삭제</td>
</tr>
<%
  String  sql= " select  * from customertbl ";
  
  PreparedStatement  pst=con.prepareStatement(sql);
  
  ResultSet rs  = pst.executeQuery();
  while( rs.next()) {

%>


<tr>
<td> <%= rs.getString(1) %> </td>
<td> <%= rs.getString(2) %></td>
<td> <%= rs.getString(3) %></td>
<td> 
<a  href="updateForm.jsp?id=<%= rs.getString(1)%>">변경</a>
<a href="delete_action.jsp?id=<%= rs.getString(1) %>">삭제</a>
</td>
</tr>


<%}
  
  rs.close();
  pst.close();
  con.close();
  
  %>
</table>

</body>
</html>