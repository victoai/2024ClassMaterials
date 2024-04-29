package com.acorn.aopex.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAOPEx {

	public static void main(String[] args) {
	
 
		 
		
		ApplicationContext  ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		
		MyCalculator  cal  = (MyCalculator) ac.getBean("myCalculator");
		int result1=cal.add(5, 3);	
		int result2=cal.sub(5, 3);
		int result3 =cal.test();
		
		
		System.out.println( result1);
		System.out.println( result2);
		System.out.println( result3);
	

		
	}

}
