<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Birth Dates</title>
</head>
<body>
    <%
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Connection con=null;
        
        try {
           
        	Class.forName(driver); 
            con= DriverManager.getConnection(url, user, password);
            
            Statement statement = con.createStatement();
            
            String query = "SELECT TO_CHAR(TO_DATE(BIRTH, 'YYYY-MM-DD'), 'yyyy\"년\"mm\"월\"dd\"일\"') AS birth FROM tbl_join_200";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String birth = resultSet.getString(1);
    %>
                <p>Birth: <%= birth %></p>
    <%
            }
            
            resultSet.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
</body>
</html>
