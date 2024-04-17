package com.acorn.di.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramTestSpringContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		 /*
	     * 객체 생성, 주입 =>  Spring Ioc Container * 
	     * 지시서 작성 : xml , java config  , 어노테이션	       
	     */		
		ApplicationContext ac = new GenericXmlApplicationContext( "com/acorn/di/calculator/setting.xml"  );
	
		
		//스프링 컨테이너로 부터 값을 얻어오는 두 가지 방법
		// 1. bean의 클래스 type
		// 2. bean의 id로
		
		//Program  program  = ac.getBean(Program.class);		
		// 	program.addNumber(5, 3); 
		Program  program2= (Program) ac.getBean("program");
		program2.addNumber(5, 3); 
		
 

	}

}
