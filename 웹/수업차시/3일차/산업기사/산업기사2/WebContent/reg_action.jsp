<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbcon.jsp" %>
    
<%
  request.setCharacterEncoding("utf-8");

  String id = request.getParameter("id");
  String name = request.getParameter("name");
  String address = request.getParameter("address");
  String tel = request.getParameter("tel");
 
  out.println( id);
  out.println( name);
  out.println( address);
  out.println( tel);
  
 /*
  String sql =  "insert into tbl_test_customer values( ?,?,?,?)";
  PreparedStatement  pst = con.prepareStatement(sql);
  pst.setString(1, id);
  pst.setString(2, name);
  pst.setString(3, address);
  pst.setString(4, tel);  
  pst.executeUpdate();
  */  
  //String sql ="insert into tbl_test_customer values( 'H011','최인호', '서울시', '010-111-111')";
  String sql =  "insert into tbl_test_customer values( ' " + id  + "','"+name+" ', '"+ address+"', '"+tel+"')";
  Statement   st = con.createStatement();  
  st.executeUpdate(sql);    
  response.sendRedirect("index.jsp");
%>

 