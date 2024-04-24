package com.acorn.batis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
 
public class MemberDaoTest {

	
	@Autowired
	 MemberDao dao;
  
  
	@Test
	public void test2() throws Exception { 
		int result  =  dao.insert(new Member("test05","1234","장주원" ));
		assertTrue(result ==1);
	}
	
	
 
	@Test
	public void test3() throws Exception { 
		assertTrue( dao.selectAll().size() >=1);
		  
	}

	 
	@Test
	public void test4() throws Exception {	 
		assertTrue( dao.delete("test05") ==1);
		  
	}


}
