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
 <tr>
 <td>a</td>
 <td>b</td>
 <td>c</td>
 <td>d</td>
 <td>e</td>
 </tr>
<%   
 String sql =" select  s.ARTISTID  , j.JOIN_NM ,  sum( score) ,  round( avg(score) ,2)   , rank() over( order by   sum( score) desc ) as rank "; 
		sql += "  from tbl_score_200  s " ;
		sql += "  join  tbl_join_200  j " ;
		sql += " on  s.ARTISTID  = j.JOIN_ID " ; 
		sql += " group by   s.ARTISTID  , j.JOIN_NM  " ;
		PreparedStatement   pst = con.prepareStatement(sql) ;
 		ResultSet rs =  pst.executeQuery(sql); 
 while( rs.next()){
	  // System.out.println(  rs.getString(1));   

%>

 <tr>
 <td> <%=rs.getString(1) %></td>
 <td> <%=rs.getString(2) %></td>
 <td><%=rs.getString(3) %></td>
 <td><%=rs.getString(4) %></td>
 <td><%=rs.getString(5) %></td>
 </tr>
 
 <%} %>
 
</body>
</html>