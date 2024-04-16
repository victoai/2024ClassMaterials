package com.acorn.btran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
 
 
 
 
@Controller
public class MybatisController {
	
	@Autowired
	MemberService service;  
	 
	
	/*
	 * 
	 * transaction 처리 하는 코드 
	 * 
	 */
 
	@RequestMapping("/insert")
	public String test1( ) throws Exception {			
			System.out.println(" insert");
		 	String view="";	
		try {
			Member m = new Member();
		 		
		 		m.setId("744");
		 		m.setPwd("9999");
		 		m.setName("홍길동");
		 		System.out.println(" call start");
		 	    service.createUser(m)  ;
		 	    view="ok";
		}catch(Exception e) {
			 view="err";
		}
			 
		return view;
	}
 
	
	/*
	 * 
	 *  transaction  처리하지 않음 
	 * 
	 */
	 
	@RequestMapping("/insert2")
	public String test2( )   {			  
		 		Member m = new Member();
		 		
		 		m.setId("000000");
		 		m.setPwd("9999");
		 		m.setName("홍길동");
		 		
		 		
		 	    try {
					service.createUser2(m)  ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					return "err";
				}		 	    
		 	    
		 	    return "ok";
			 
	}
	  
	 

}
