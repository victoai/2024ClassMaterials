<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
 
 <%
 //데이터 꺼내기
 
 request.setCharacterEncoding("utf-8");
 
 
  String id  = request.getParameter("id");
  String pw = request.getParameter("pw");
  String name = request.getParameter("name");
  
  System.out.println( id);
  System.out.println( pw );
  System.out.println( name);
 
 
 //변경sql작성하고 실행하기
 
  String sql=" update  customertbl  set pw=?   where id  =? " ;
  PreparedStatement pst  =con.prepareStatement(sql);
  pst.setString(1,  pw);
  pst.setString(2,  id);  
  pst.executeUpdate();
 
 //원하는 페이지로 이동하기 
 response.sendRedirect("search.jsp");
 
 %>