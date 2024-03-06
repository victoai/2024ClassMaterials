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
<caption> 후보자 조회</caption>
<tr>
<td>후보자번호</td>
<td>후보자이름</td>
<td>후보자주민번호</td>
<td>후보자학위</td>
<td>당번호</td>
<td>당전화번호</td>
</tr>
<%
   String sql ="   select  m.n_no,  m.n_name,  substr( m.N_JUMIN ,1,6 ) || '-' ||  substr( m.n_jumin , 7,7) as jumin, ";
           sql += "  decode(  m.n_degree, '01', '고졸', '02' ,'학사' , '03','석사', '04','박사') as degree ,  ";
	       sql += "  m.p_no   ,  p_tel1 ||'-'|| p_tel2|| '-'|| p_tel3 ";
	       sql += " from  tbl_member_010  m "; 
	       sql += " join tbl_party_010    p  "; 
	       sql += " on m.P_NO = p.P_NO ";
		  
   System.out.println( sql );	  
   PreparedStatement   pst  =con.prepareStatement(sql);
   ResultSet rs = pst.executeQuery();
   while( rs.next()){
%>


<tr>
<td> <%= rs.getString(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getString(4) %></td>
<td><%= rs.getString(5) %></td>
<td><%= rs.getString(6) %></td>
</tr>

<%}
   rs.close();
   pst.close();
   con.close();    
  %>

</table>

</body>
</html>