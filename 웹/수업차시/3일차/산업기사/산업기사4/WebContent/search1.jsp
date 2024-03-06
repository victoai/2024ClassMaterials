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
<caption> 투표자 조회</caption>
<tr>
<td>투표자이름</td>
<td>투표자생년월일</td>
<td>투표자나이</td>
<td>투표자성별</td>
<td>투표장</td>
<td>유권자확인</td>
</tr>
<%
   String sql =" select  v_name,  '19' || substr( v_jumin  , 1,2) ||'년' ";   
		  sql += " || substr( v_jumin  , 3,2) ||'월' || substr( v_jumin  , 5,2) ||'일' as birth, ";      
		  sql += " case  when   substr(v_jumin,3,2)  >   to_char(sysdate,'mm') then  "; 
		  sql += " to_char(sysdate, 'yyyy') -  to_number( '19' ||substr(v_jumin ,1,2))  -1  ";
		  sql += "  else    to_char(sysdate, 'yyyy') -  to_number( '19' ||substr(v_jumin ,1,2)) " ;
		  sql += "      end  as age , ";
		  sql += " decode( substr(v_jumin ,7,1) , '1','남자' ,'2' ,'여자') , ";
		  sql += "      v_area, decode( v_confirm , 'y', '확인', '미확인') ";       
		  sql += " from vote_tbl_010 ";
		  
		  
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