package com.acorn.btran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
 
import org.springframework.transaction.TransactionStatus;
 
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Component
public class MemberService {
	@Autowired
	MemberDao dao;

	@Autowired
	private PlatformTransactionManager tm;

	public void createUser(Member m) throws Exception {
		System.out.println("createUser call");
		TransactionStatus status = tm.getTransaction(new DefaultTransactionDefinition(new DefaultTransactionDefinition()));

		try {

			dao.insert(m);
			dao.insert(m);

			tm.commit(status);
		} catch (Exception e) {
			tm.rollback(status);
			System.out.println("rollback 한다");
			throw e;
		}

	}

	public void createUser2(Member m) throws Exception {
		dao.insert(m);
		dao.insert(m);

	}
}