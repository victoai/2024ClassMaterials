package ajaxPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FoodDAO {
	
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="system";
	  String password="1234";	 
	  Connection con;	
	
	
	public void dbcon(){	 
		
		try {
			Class.forName(driver);
			con  =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Food>  getFoodList(){		
		
		 dbcon();		 
		 String sql=" select  * from  food_tbl ";
		 ArrayList<Food> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){				
				 String type=rs.getString(2);
				 String menu= rs.getString(3);
				 int price = rs.getInt(4);
				 Food food = new Food( type, menu, price);
				 list.add(food);						 
			   //  list.add(  new Food(rs.getString(2) , rs.getString(3), rs.getInt(4) ) );  	
			}	
			rs.close();
			pst.close();
			con.close();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	 
		return list;	 
		
	}
	
	

	public static void main(String[] args){
		  FoodDAO f = new FoodDAO();
	//	  f.dbcon();
		  ArrayList<Food> list  = f.getFoodList();	  
		  System.out.println( list);
		  
	}
	
	
}
