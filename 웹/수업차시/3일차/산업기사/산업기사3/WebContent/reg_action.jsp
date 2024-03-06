<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>

    
   <%
   
   request.setCharacterEncoding("utf-8");
   
   String  join_id  =  request.getParameter("join_id");
   String  join_nm = request.getParameter("join_nm");
   String  year = request.getParameter("year");
   String  month = request.getParameter("month");
   String  day = request.getParameter("day");
   String  gender = request.getParameter("gender");
   String  specialty = request.getParameter("specialty");
   String  charm = request.getParameter("charm");
 
   
   String  birth =  year +month+day;
   
   out.println( join_id);
   out.println( join_nm);   
   out.println( year);
   out.println( month);
   out.println( day);
   out.println( birth);
   out.println( gender); 
   out.println( specialty);
   out.println( charm);
  
   
   
    String sql=" insert into  tbl_join_200  values(?,?,?,?,?,?) ";
    // insert    
    PreparedStatement pst  =con.prepareStatement(sql);   
    pst.setString(1,  join_id);
    pst.setString(2,  join_nm);
    pst.setString(3,  birth);
    pst.setString(4,  gender);
    pst.setString(5,  specialty);
    pst.setString(6,  charm);
    
   
    pst.executeUpdate();
    
    response.sendRedirect("index.jsp");
   
   %>