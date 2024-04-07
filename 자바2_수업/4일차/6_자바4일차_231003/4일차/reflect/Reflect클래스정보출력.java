package java2.day4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect클래스정보출력 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
	 // 클래스 정보 얻어오기 (3가지 방법)
	//	Class  clazz = Class.forName("java2.day4.reflect.Member");			
	//	Class  clazz = new Member().getClass(); 
		Class  clazz  = Member.class;
		
		System.out.println("\n=======클래스객체로 부터 모든 필드정보 얻어오기====================\n");		 
		Field fields[] = clazz.getDeclaredFields();
		for (Field field : fields) {
		    System.out.println( field);
		}

		
		System.out.println("\n=======클래스객체로 부터  선언된 매서드정보 얻어오기====================\n");
		Method[] methods = clazz.getDeclaredMethods();
		for( Method method : methods){
			System.out.println( method);
		}
		 
		
		
	}

}
