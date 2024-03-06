<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
    
<%
   String id = request.getParameter("id");
   System.out.println( id) ;
   
   
   //id에 해당하는 고객정보 한 개 조회 
   String sql=" select   * from customertbl  where  id= ? ";
   PreparedStatement pst  =con.prepareStatement(sql);
   pst.setString(1, id);
   ResultSet rs = pst.executeQuery();
   
   String pw="";
   String name="";
    
   //아이디에 존재하는 결과가 있으면 
   if( rs.next()){
	   
	   pw= rs.getString(2);
	   name = rs.getString(3);
	   out.println(pw);
	   out.println( name);
   }

   rs.close();
   pst.close();
   con.close();
   
%>
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

td:nth-child(1){
  text-align: center;
}
</style>
 
</head>
<body>

<form  action="update_action.jsp"  method="post"> 

<table>
<tr>
<td>아이디</td>
<td><input type="text"  value="<%=id%>"  name="id"  readonly ></td>
</tr>

<tr>
<td>비번</td>
<td><input type="text"  value="<%=pw%>"  name="pw"></td>
</tr>

<tr>
<td>이름</td>
<td><input type="text"  value="<%=name%>" name="name"></td>
</tr>


<tr>
 
<td colspan="2"><input type="submit" value="변경"  ></td>
</tr>
</table>

</form>
</body>
</html>