package com.acorn.batis;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 

 

@Controller
public class MybatisController {
	
	@Autowired
	MemberDaoMybatis dao;
	 
	
	@RequestMapping("/count")
	public void test( ) {		
		 	try {
		 		System.out.println(		dao.count());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 
	
	@RequestMapping("/selectAll")
	public void test2( ) {		
		 	try {
		 		System.out.println(		dao.selectAll());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 
	
	@RequestMapping("/insert")
	public void test3( ) {		
		 	try {
		 		Member m = new Member();
		 		m.setId("test09");
		 		m.setPwd("pppp");
		 		m.setName("hong");
		 		dao.insert(m) ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@RequestMapping("/delete")
	public void test4( ) {		
		 	try {
		 		System.out.println(		dao.delete("01"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	@RequestMapping("/deleteAll")
	public void test5( ) {		
		 	try {
		 		System.out.println(		dao.deleteAll());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	 

}
