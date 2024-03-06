<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
 <%
 
   //데이타베이스 연결   
     String driver="oracle.jdbc.driver.OracleDriver";
	 String url  ="jdbc:oracle:thin:@localhost:1521:xe";
	 String user="system";
	 String password="1234";
    
   //드라이브 로딩
    Class.forName(driver);   
   //연결
   Connection  con  = DriverManager.getConnection(url, user, password);
   
   if( con !=null) {
	   System.out.println(" ok");
   }
 
 %>