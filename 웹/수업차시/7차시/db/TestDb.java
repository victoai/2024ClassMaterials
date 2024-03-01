package prj5;

import java.sql.*;
 

  

public class TestDb {

	public static void main(String[] args) {

		Connection con=null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			//db연결정보 
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String password="1234";
			
			Class.forName( driver);			
			con = DriverManager.getConnection(url, user, password);
			
			st = con.createStatement();			
			String sql ="select * from customertbl";			
			rs = st.executeQuery(sql);			
			while( rs.next()){
				
				System.out.print( rs.getString(1) + " ");
				System.out.print( rs.getString(2)  + " ");				
				System.out.println( rs.getString(3));
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
