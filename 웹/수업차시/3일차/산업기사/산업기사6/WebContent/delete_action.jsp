<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ include file="dbcon.jsp" %>
    <%
    
      String id= request.getParameter("id"); 
      System.out.println( id);
    
      
      //삭제sql 실행
      String sql =" delete   from  tbl_course_300   where  s_id = ? ";
      
      PreparedStatement pst= con.prepareStatement(sql);
      pst.setString(1,id );
      pst.executeUpdate();
      
      pst.close();
      con.close();      
    
      response.sendRedirect("search.jsp");
    
    %>
    
    
    