package com.acorn.day3.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemoService {

	@Autowired
	MemoDAO dao;
	
	public ArrayList<Memo> getSelectAll(){
		ArrayList<Memo> memoList = new ArrayList<>();
		memoList = dao.selectAll();
		return memoList;
	}
	
	public void getRegister(String content) {
		dao.register(content);
	}
	
	public void getUpdate(String code, String content) {
		dao.update(code, content);
	}
	
	public void getDelete(String code) {
		dao.delete(code);
	}
	
	
	
	
}
