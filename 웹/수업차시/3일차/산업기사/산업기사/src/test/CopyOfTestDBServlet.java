package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
public class CopyOfTestDBServlet  extends HttpServlet{

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
				String sql =" select g.PNAME 제품명,  to_char( sum(g.PRICE * o.SALE_CNT) , '999,999') || '원' 판매총합  " ;
					   sql += " from TBL_TEST_GOODS g ";
					   sql += " join TBL_TEST_ORDER o ";  
					   sql += "	on o.PCODE = g.PCODE ";
					   sql += "	group by g.pname ";
					   sql += "	order by 판매총합  DESC"; 	
					   
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
