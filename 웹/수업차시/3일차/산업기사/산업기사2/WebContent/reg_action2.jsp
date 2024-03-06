<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ include file="dbcon.jsp" %>
 
 <%
   //post 넘어오는 데이터의 한글처리
  request.setCharacterEncoding("utf-8"); 
                                  // name에 지정된 이름으로 값을 꺼낸다 . 주의 ! 설정된 name이름으로 꺼내야함
  String id  = request.getParameter("id");
  String name  = request.getParameter("name");
  String address  = request.getParameter("address");
  String tel  = request.getParameter("tel");
  
  
  out.println( id);
  out.println( name);
  out.println( address);
  out.println( tel); 
  
  //디비작업
  // => 테이블 insert  
  
  //String sql =" insert into tbl_test_customer values('"+ id+"','"+ name+"','"+address+"','"+tel+"')";
  String  sql =" insert into tbl_test_customer values(?,?,?,?)";
  PreparedStatement  pst =con.prepareStatement(sql);
  pst.setString(1, id);
  pst.setString(2, name);
  pst.setString(3, address);
  pst.setString(4, tel);  
  pst.executeUpdate();    
  response.sendRedirect("CustomerList.jsp");
 
 %>