package com.acorn.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestRepository {	 
	
	@Autowired
	DataSource ds;
	
	
	public  int insertMember(  Member member) {				
		
		//sql작성  데이터베이스에 insert 하기
		int resultRow=0;
		try {
			String sql="insert into  membertest2  values(  ?,?,?,?) ";
			Connection con  = ds.getConnection();
		    PreparedStatement pst  =   con.prepareStatement(sql)	;
		    pst.setString(1, member.getId());
		    pst.setString(2, member.getName());
		    pst.setDouble(3,  member.getLatitude());
		    pst.setDouble(4,   member.getLongitude());
		    resultRow  = pst.executeUpdate();
		    close(pst, con);
		    return resultRow;			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return  resultRow;
	}
	
	
	private void close( AutoCloseable ...autoCloseables ) {
		for( AutoCloseable obj : autoCloseables) {
			try {
				obj.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
