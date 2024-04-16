package com.acorn.day3.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemoDAO {

	@Autowired
	DataSource ds;
	
	public ArrayList<Memo> selectAll() {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select * from "
				   + "(select rownum, 'A' || code \"CODE\", content from memoTbl)";
		
		ArrayList<Memo> memoList = new ArrayList<>();
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt(1);
				String code = rs.getString(2);
				String content = rs.getString(3);
				
				Memo memo = new Memo(num, code, content);
				memoList.add(memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close(rs,pst,con);
		return memoList;
		
	}
	
	public Memo selectOne(String code) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = "select * from "
				   + "(select rownum, 'A' || code \"CODE\", content from memoTbl) "
				   + "where code = ? ";
		Memo memo = null;
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, code);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				int num = rs.getInt(1);
				String content = rs.getString(3);
				
				memo = new Memo(num, code, content);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close(rs,pst,con);
		return memo;
	}
	
	public void register(String content) {
		Connection con = null;
		PreparedStatement pst = null;
		
		String sql = "insert into memoTbl values(memoSq.nextval, ?)";
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, content);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, con);
	}
	
	public void update(String code, String content) {
		Connection con = null;
		PreparedStatement pst = null;
		
		String sql = "update (select 'A' || code \"CODE\", content from memoTbl) "
				   + "set content = ? where code = ?";
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, content);
			pst.setString(2, code);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		close(pst, con);
	}
	
	public void delete(String code) {
		Connection con = null;
		PreparedStatement pst = null;
		
		String sql = "delete from "
				   + "(select 'A' || code \"CODE\", content from memoTbl) "
				   + "where code = ?";
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, code);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, con);
	}
	
	public void close(AutoCloseable ...a) {
		for(AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
