<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="dbcon.jsp" %>
 
 <%
 
 String id  = request.getParameter("id");
 System.out.println( id);
 
 
 //sql작성  실행
 
 String sql=" delete from customertbl where id  = ? ";
 PreparedStatement pst  = con.prepareStatement(sql);
 
 pst.setString(1,id );
 pst.executeUpdate();  
  
 //페이지 이동 
 response.sendRedirect("search.jsp") ;
 %>
 
 