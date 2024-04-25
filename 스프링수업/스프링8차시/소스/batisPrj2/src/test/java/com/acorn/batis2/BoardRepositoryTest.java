package com.acorn.batis2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )

public class BoardRepositoryTest {

	
	@Autowired
	BoardRepository dao;

	@Test
	public void test() throws Exception {
		
		 SearchCondition s = new SearchCondition();
		 s.setCondition("writer");
		 s.setKeyword("박상원");
		 System.out.println( dao.searchCondition(s).size());
	}

}
