<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="dbcon.jsp" %>
  
 
 
 <%
    String id = request.getParameter("id");
    System.out.println( id);
    
    String sql  ="  select  s_id, s_name, s_grade,teacher_id, trim( weekday), START_H , end_h  from tbl_course_300  where s_id= ? "; 
    PreparedStatement  pst  = con.prepareStatement(sql);
    pst.setString(1, id);
    ResultSet  rs  =pst.executeQuery();
    
    String s_id="";
    String s_name="";
    String s_grade="";
    String teacher_id ="";
    String weekday="";
    String start_h="";
    String end_h="";
    
    
    if( rs.next()){    	
    	s_id = rs.getString(1);
    	s_name = rs.getString(2);
    	s_grade=  rs.getString(3);
    	teacher_id = rs.getString(4);
    	weekday = rs.getString(5);
    	start_h = rs.getString(6);
    	end_h = rs.getString(7);    	
    } 
 
 %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table{
border:1px solid black ;
margin:0 auto;
border-collapse: collapse;
}
td{
border:1px solid black

}
</style>
</head>
<body>


<form name="frm" action="update_action.jsp"  method="post">
<table>
<tr>
<td>교과목코드</td>
<td><input type="text"   name="s_id"  readonly ></td>
</tr>

<tr>
<td>교과명</td>
<td><input type="text" name="s_name"></td>
</tr>

<tr>
<td>담당강사</td>
<td>
  <select name="teacher_id">
  	<option> </option>
  	<option value="1">정국교수</option>
  	<option value="2">뷔교수</option>
  	<option value="3">지민교수</option>
  	<option value="4">제이홉교수</option>
  	<option value="5">슈가교수</option>
  	<option value="6">진교수 </option>
  	<option value="7">RM교수 </option>	
  	  	
  	
  </select>
</td>
</tr>

<tr>
<td>학점</td>
<td><input type="text" name="s_grade"></td>
</tr>

<tr>
<td>요일</td>
<td>
 <input type="radio" value="M"  name="weekday"> 월
 <input type="radio" value="TU" name="weekday"> 화 
 <input type="radio" value="W"  name="weekday"> 수
 <input type="radio" value="TH" name="weekday"> 목
 <input type="radio" value="F"  name="weekday"> 금
 <input type="radio" value="S"  name="weekday"> 토
</td>
</tr>


<tr>
<td>수업시작시간</td>
<td><input type="text" name="start_h"></td>
</tr>

<tr>
<td>수업종료시간</td>
<td><input type="text" name="end_h"></td>
</tr>


<tr>
 
<td  colspan="2"><input type="submit" value="변경">  </td>
</tr>

</table>

</form>

</body>
</html>





<script>

 let frm  = document.frm; 
 frm.s_id.value="<%=s_id%>";
 frm.s_name.value="<%=s_name%>";
 frm.s_grade.value="<%=s_grade%>";
 frm.weekday.value="<%=weekday%>";
 
 frm.start_h.value="<%=start_h%>";
 frm.end_h.value="<%=end_h%>";
 frm.teacher_id.value="<%=teacher_id%>";



</script>