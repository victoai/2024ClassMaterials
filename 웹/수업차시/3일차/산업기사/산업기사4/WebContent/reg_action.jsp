<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="dbcon.jsp" %>

    
    
    <%
    
    request.setCharacterEncoding("utf-8");
    // request 데이터 꺼내기 
    
    
    
    String v_jumin=   request.getParameter("v_jumin");
    String v_name=   request.getParameter("v_name");
    String n_no=   request.getParameter("n_no");
    String v_area=   request.getParameter("v_area");
    String v_time=   request.getParameter("v_time");
    String v_confirm=   request.getParameter("v_confirm");
        
    
    out.println( v_jumin);
    out.println( v_name);
    out.println( n_no);
    out.println( v_area);
    out.println( v_time);
    out.println( v_confirm);
    
    
    // 
    
    String sql=" insert into vote_tbl_010 values( ?,?,?,?,?,?)";    
    PreparedStatement  pst=  con.prepareStatement(sql);
    pst.setString(1, v_jumin);
    pst.setString(2, v_name);
    pst.setString(3, v_area);
    pst.setString(4, v_time);
    pst.setString(5, v_confirm);
    pst.setString(6, n_no);    
    pst.executeUpdate();
    
    // 페이지 
    // response.sendRedirct();    
    response.sendRedirect("index.jsp");
    
    pst.close();
    con.close();
    
    %>