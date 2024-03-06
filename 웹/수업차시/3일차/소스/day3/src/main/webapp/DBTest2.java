package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest2 { 

				public static void main(String[] args) {

					String driver = "oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@localhost:1521:testdb";
					String user = "scott";
					String password = "tiger";

					try {
						Class.forName(driver);
						// try-with-resources 구문 사용
						try (Connection con = DriverManager.getConnection(url, user, password)) {
							if (con != null) {
								System.out.println("o2222222222222222");
							}
						}
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					} 
 
	  }

}
