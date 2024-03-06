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
  width:800px;
  border:1px solid black;
  margin:0 auto;
  
  }
  td{
   border:1px solid black;
   text-align: center;
  }
</style>
</head>
<body>

<table>
<caption> 득표수 조회</caption>
<tr>
<td>후보자번호</td>
<td>후보자이름</td>
<td>후보자득표수</td> 
</tr>
<%
   String sql =" select v.N_NO , m.N_NAME , count(m.N_NAME) ";
		    sql += " from vote_tbl_010   v " ;
		    sql += " join tbl_member_010 m ";
		    sql += " on v.N_NO = m.N_NO  " ; 
		    sql += " group by v.N_NO , m.N_NAME ";
		  
   System.out.println( sql );	  
   PreparedStatement   pst  =con.prepareStatement(sql);
   ResultSet rs = pst.executeQuery();
   while( rs.next()){

%>


<tr>
<td> <%= rs.getString(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
 
</tr>

<%}
   rs.close();
   pst.close();
   con.close();    
  %>

</table>

</body>
</html>