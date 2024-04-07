package java2.day4.reflect;

import java.lang.reflect.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect객체생성하기2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		//클래서정보 얻어오기 
		Member m = new Member();
		Class  clazz =   m.getClass();
		
		 
		 
		
		//클래스정보를 이용하여 객체생성하기		
		Member member = (Member)clazz.newInstance() ; // 기본생성자를 이용하여 객체를 생성한다
		
		
		// 자바9버전 이후 생성자 객체를 얻어온후 생성자를 통해서 객체를 생성함
		Constructor  constrctor = clazz.getDeclaredConstructor();
		Member member2 = (Member) constrctor.newInstance();
		
		System.out.println( member);
		System.out.println( member2);
		
		
		
	}

}
