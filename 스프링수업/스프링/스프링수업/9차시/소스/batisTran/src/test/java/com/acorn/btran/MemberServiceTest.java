package com.acorn.btran;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/test.xml",
		"file:src/main/webapp/WEB-INF/spring/**/test2.xml" })

public class MemberServiceTest {

	@Autowired
	MemberDao dao;

	@Autowired
	private PlatformTransactionManager transactionManager;

	@Test
	public void test() {

		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

		Member m = new Member();
		m.setId("11");
		m.setPwd("test");
		m.setName("test");
		
		try {
			
			dao.insert(m);
			dao.insert(m);

			transactionManager.commit(status);
		} catch (Exception e) {
			transactionManager.rollback(status);
			System.out.println("rollback 한다");
			
		}
	}

}
