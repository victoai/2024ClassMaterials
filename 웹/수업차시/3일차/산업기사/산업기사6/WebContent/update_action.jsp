<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="dbcon.jsp" %>
 
 
 <%
   // 꺼내기
    request.setCharacterEncoding("utf-8");
 
 
  	String s_id  = request.getParameter("s_id");
	String s_name  = request.getParameter("s_name");
	String teacher_id  = request.getParameter("teacher_id");
	String s_grade  = request.getParameter("s_grade");
	String weekday  = request.getParameter("weekday");
	String start_h  = request.getParameter("start_h");
	String end_h  = request.getParameter("end_h");
	
  	System.out.println( s_id);
  	System.out.println( s_name);
  	System.out.println( teacher_id);
  	System.out.println( s_grade);
  	System.out.println( weekday);
  	System.out.println( start_h);
  	System.out.println( end_h);
  	
  	String sql="     update tbl_course_300 ";
  		   sql +=  " set teacher_id=? , weekday=?,  s_grade=?";
  		   sql += "  where s_id =? ";
  	
  	
  
  	PreparedStatement pst   = con.prepareStatement(sql);
  	pst.setString(1, teacher_id);
	pst.setString(2, weekday);
	pst.setString(3, s_grade);
	pst.setString(4 , s_id);
  	
  	pst.executeUpdate();
 
    response.sendRedirect("search.jsp");
 %>