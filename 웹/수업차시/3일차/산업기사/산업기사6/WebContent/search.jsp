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
margin: 0 auto;
border-collapse: collapse;
}

td{
border:1px solid black;
text-align: center;
}
</style>
</head>
<body>

<table>
<tr>
<td>과목코드</td>
<td>과목명</td>
<td>학점</td>
<td>담당강사</td>
<td>요일</td>
<td>시작시간</td>
<td>종료시간</td>
<td>관리</td>
</tr>

<%

   String sql="   select  c.s_id, c.s_name, c.s_grade ,  l.T_NAME  , ";  
		  sql += " decode( trim(c.weekday) , 'M','월', 'TU','화', 'W', '수', 'TH', '목' , 'F','금','S','토')  weekday, "; 
		  sql += " substr( lpad(c.start_h, 4 ,0) , 1,2)  ||  ':'  ||  substr( lpad(c.start_h, 4 ,0) , 3,2)  start_h, "; 
		  sql += " substr( c.end_h ,1,2) || ':' ||  substr( c.end_h, 3,2)  end_h ";
		  sql += " from tbl_course_300  c ";
		  sql += " join  TBL_LECTURER_300 l ";
		  sql += " on  c.TEACHER_ID  = l.T_ID ";
   
	System.out.println( sql  ); 
	
	PreparedStatement   pst  = con.prepareStatement(sql);
	ResultSet  rs =pst.executeQuery();
	
	while( rs.next()) {
	
%>

<tr>
<td>  <%=rs.getString(1) %></td>
<td>  <%=rs.getString(2) %></td>
<td> <%=rs.getString(3)%></td>
<td> <%=rs.getString(4) %></td>
<td> <%=rs.getString(5) %></td>
<td> <%=rs.getString(6) %></td>
<td> <%=rs.getString(7) %></td>
<td> 
<a href="update_form.jsp?id=<%=rs.getString(1) %>"> 수정</a>/
<a href="delete_action.jsp?id=<%=rs.getString(1) %>">삭제 </a></td>
</tr>

<%} 

	rs.close();
	pst.close();
	con.close();

%>

</table>

</body>
</html>