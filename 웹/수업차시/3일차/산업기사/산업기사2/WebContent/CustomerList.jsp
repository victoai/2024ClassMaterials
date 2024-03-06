<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
<caption> 회원목록</caption>
<tr>
<td>아이디</td>
<td>이름</td>
<td>주소</td>
<td>전화번호</td>
</tr>

<%
  String sql="select  * from tbl_test_customer";
  PreparedStatement  pst= con.prepareStatement(sql);
  ResultSet  rs  =pst.executeQuery();
   while( rs.next()){
%>

<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
</tr>


<%} %>
</table>
</body>
</html>