package java2.day4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect매서드호출 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		
		
		
		 Member  member = new Member("wjy","1234");		
 	   	 //매서드호출
		 member.printInfo(); 
		
		 
		//매서드 호출	
		Class clazz  = member.getClass();
		System.out.println("=====>  method invoke ");
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져오기==============\n");	
		Method method  = clazz.getDeclaredMethod("printInfo");
		method.invoke(member); 
			
		
		
		//매서드호출
		System.out.println("=====>  method invoke ");
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져오기==============\n");		 
		Method method2 = clazz.getDeclaredMethod("method2", int.class);
		System.out.println( method2);		
		System.out.println("\n==========클래스정보로 부터 매서드 정보가져온 다음 호출하기=============\n");
		//매소드를 객체를 이용하여 매소드 실제 실행, 호출, invoke
		method2.invoke( member ,6);	
	
		

	}

}
