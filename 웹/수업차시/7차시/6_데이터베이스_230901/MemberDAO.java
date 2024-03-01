package mvc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	Connection con=null; 
	
	
	public void dbcon() {
		try {
			Class.forName(driver);
			con= DriverManager.getConnection(url, user, password);  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
	}
	
	public void insert() throws SQLException  {
		
		dbcon();
		
		PreparedStatement st = null; 
	 
		String sql ="insert into acorntbl values(?,?,?) "; 
		try {
			st = con.prepareStatement(sql);		
			st.setString(1, "dy");
			st.setString(2, "0000");
			st.setString(3, "곽단야");
			
			  st.executeUpdate( ) ; 
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 throw e;
		}finally {
		
		//rs.close();
		//st.close();
		//con.close();]
			 autoClose( st, con);
		}
		
	}

	
	
	public ArrayList<String>  getList()  {	
		
		dbcon();
		
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<String> list = new ArrayList<>();		 
		String sql ="select * from  acorntbl "; 
		try {
			st = con.prepareStatement(sql);		 
			rs = st.executeQuery( ) ; 
			
			while( rs.next() ) {
				 list.add(rs.getString(1));
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	throw e;
		}finally {
		
		//rs.close();
		//st.close();
		//con.close();]
			 autoClose( rs,st, con);
		}
		
		return list;
	}
	
	
	
	public void autoClose( AutoCloseable ...autoCloseables) {
		
		for(  AutoCloseable obj : autoCloseables) {
			try {
				obj.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	
	 

}
