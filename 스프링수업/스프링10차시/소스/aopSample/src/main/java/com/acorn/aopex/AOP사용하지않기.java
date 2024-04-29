package com.acorn.aopex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.stereotype.Component;
 

class MyClass2{
	  public void aaa() {
		  //관점이 다른 코드
		  System.out.println("hi");		  
		 // long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기 , 부가기능(관점이 다른 코드)		   
		  System.out.println( "aaa");
		  
		 /* long afterTime = System.currentTimeMillis(); 
		  long secDiffTime = (afterTime - beforeTime)/1000;
		  System.out.println("시간차이(m) : "+secDiffTime);
		  */
		  System.out.println("bye");
	  }
	  
	  public void aab() {
		  //관점이 다른 코드
		   System.out.println("hi");
		   
		   //핵심코드
		   System.out.println( "aab");
		   		   
		   //관점이 다른코드
		   System.out.println("bye");
	  }
	  
	  public void bbb(  ) {
		  System.out.println("hi");
		  
		  //핵심코드
		  System.out.println( "bbb");
		  
		  System.out.println("bye");
	  }	  
}



//위임객체
class MyAdvice2{	
	
	
	//매서드정보, 객체 , 매개변수
	 public Object invoke( Method m  ,  Object obj ,  Object...args ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
	
		 //
		 System.out.println("before hi");		 
		 Object result  = m.invoke(obj, args);		 
		 System.out.println("after bye");		 
		 return result;
		 
	 }
	
	
}


public class AOP사용하지않기 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 
		  MyClass2  my = new MyClass2();
		  my.aaa();
		  my.aab();
		  my.bbb();  
	}

}
