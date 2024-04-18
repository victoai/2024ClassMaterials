package com.acorn.day3.db;

import java.sql.Connection;
import java.sql.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * 
 * 		<dependency>
		    <groupId>com.oracle.ojdbc</groupId>
		    <artifactId>ojdbc8</artifactId>
		    <version>19.3.0.0</version>
		</dependency>

		<dependency>
		    <groupId>org.springframework</groupId>
		    <artifactId>spring-jdbc</artifactId>
		    <version>${org.springframework-version}</version>
		</dependency>
	
 * 
 * 
 */


/* 
 * 	<bean    class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName" value="oracle.jdbc.driver.OracleDriver"></property>
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:testdb"></property>
		<property name="username" value="scott"></property>
		<property name="password" value="tiger"></property>
	</bean>
		
 */
@Component
public class TestDAO {	
	
	@Autowired
	DataSource ds;	
	
	public void select() {		
		String sql="select * from member_tbl_11";
		try {
			Connection con = ds.getConnection();
			PreparedStatement  pst =con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			} 			
			//
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
