<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="index.css"  rel="stylesheet">
<link href="search2.css" rel="stylesheet">

</head>
<body>

<header>
 <h2> HY라우드 오디션  ver 1.0</h2> 
</header>
<nav>
<a href="reg.jsp">참가자등록</a>
<a href="search1.jsp">참가자목록조회</a>
<a href="search2.jsp">참가자점수조회</a>
<a href="search2.jsp">참가자등수조회</a>
<a href="index.jsp">홈으로</a>
</nav>
<section>
 <table>
 <caption> 참가자조회</caption>
 <tr>
 <td>점수번호</td>
 <td>참자가ID</td>
 <td>참가자이름</td>
 <td>생년월일</td>
 <td>점수</td>
 <td>등급</td> 
 <td>멘토이름</td> 
 </tr>
 <!--  내용  -->
 
 <%
  String sql =" SELECT  score_no , artistid , join_nm , substr(birth,1,4)|| '년' || substr(birth, 5,2) || '월' ||  substr(birth, 7,2) || '일'  , score,    decode(  trunc(score / 10) , '10' ,'A', '9','A','8','B','7','C','D') ,    mentor_nm ";
		 sql += " FROM  tbl_score_200 s , tbl_join_200  j, tbl_mentor_200 m " ;
		 sql += " WHERE  s.artistid  = j.join_id  and s.mentorid  = m.mentor_id "; 
		 sql += " ORDER BY score_no ";  
  System.out.println("sql="+  sql );
  PreparedStatement  pst=con.prepareStatement(sql);   
  ResultSet rs = pst.executeQuery();
  while( rs.next()){
 %>
<tr>
 <td> <%= rs.getString(1) %></td>
 <td> <%= rs.getString(2) %></td>
 <td> <%= rs.getString(3) %></td>
 <td> <%= rs.getString(4) %></td>
 <td> <%= rs.getString(5) %></td>
 <td> <%= rs.getString(6) %></td> 
 <td> <%= rs.getString(7) %></td> 
 </tr>
<% }
  
  if( rs!= null) rs.close();
  if( pst != null) pst.close();
  if( con != null) con.close();
  %>
 </table>
 
 
</section>
<footer>
  <h3>HRD KOREA </h3> 
</footer>


</body>
</html>