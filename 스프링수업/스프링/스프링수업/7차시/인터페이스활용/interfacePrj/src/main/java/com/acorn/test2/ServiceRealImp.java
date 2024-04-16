package com.acorn.test2;

import java.util.List;

// 실제DAO 구현체
public class ServiceRealImp   implements  MyService{

	// 실제dao를 이용하여 구현
	
	/*@Autowired
	  DAO dao;
	*/
	@Override
	public int registerMember(Member member) {
		int result=0;
		// TODO Auto-generated method stub
		// int result = dao.insert( member)
		return result;
	}

	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		List<Member> result=null;
		//result  = dao.selectAll();		
		return result;
	}

	@Override
	public int modifyMember(Member member) {
		// TODO Auto-generated method stub
		int result=0;
		// result = dao.update(member);
		return result;
	}

	@Override
	public int deleteMember(String userId) {
		// TODO Auto-generated method stub
		
		int result=0;
		// result = dao.delete("testid");
		return result;
	}

}
