package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/testdb")
public class TestDBServlet  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 
			 
			String driver="oracle.jdbc.driver.OracleDriver";
			String url  ="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
		    String password="1234";
			
		    PrintWriter out  =response.getWriter();
		    try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, user, password);
				if( con !=null){
					System.out.println("ok");
					out.println("ok");
				} 
				String sql =" select  m_id , m_pw, m_name, m_point from member_tbl_11"; 	
					   
				Statement st=con.createStatement();
				ResultSet  rs  =st.executeQuery(sql);
				
				while( rs.next()){
					System.out.print(rs.getString(1) + " ");
					System.out.println(rs.getString(2) + " ");
					//System.out.print(rs.getString(3) + " ");					
					//System.out.println( rs.getString(4));
				}				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
			
		 
		
		
		
	 
	}
	
}
