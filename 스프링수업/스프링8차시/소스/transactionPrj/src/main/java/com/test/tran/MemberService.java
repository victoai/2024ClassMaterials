package com.test.tran;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;


 @Component
public class MemberService  {
	
	 @Autowired
	  MemberDao  dao;
	 
	 @Autowired
     PlatformTransactionManager tm;
	 
	  
	 
	  public void insertA1WithTx(Member member) throws Exception {	         
	        TransactionStatus status = tm.getTransaction(  new DefaultTransactionDefinition()  );		           
	        try {	        	 
	        	  dao.insertUser(member);
	    		  dao.insertUser(member);
	              tm.commit(status);
	        } catch (Exception e) {
	              e.printStackTrace();	          
	              tm.rollback(status);
	              throw e;
	        }  
	    }	   
	   
	  
	  

}
