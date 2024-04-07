package java2.day4.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectEx1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		
		
		 Class   clazz =Class.forName("java2.day4.reflect.Member");		 
		 Constructor consturctor = clazz.getDeclaredConstructor();		 
		 Member  member = (Member)consturctor.newInstance();		  
		 member.printInfo();		 
		 Member m = new Member();
		 m.printInfo();
		 
		 
		 
		 
		Class clazz2=   Class.forName("java2.day4.reflect.Member");
		Constructor constructor2  =clazz2.getDeclaredConstructor(String.class, String.class);
		Member member2 = (Member)constructor2.newInstance("wjy", "1234");
		member2.printInfo();
				
		
		//객체생성하기		
		Member member2_  = new Member("wjy", "1234");
		member2_.printInfo();
		
		
		
		
		//매서드 호출		
		System.out.println("=====>  method invoke ");
		Method method  = clazz2.getDeclaredMethod("printInfo");
		method.invoke(member2_);
		 
		System.out.println( "클래스 속성, 필드  정보 출력하기 ====>");		
		Field[] fields  = clazz2.getDeclaredFields();		
		
		
		for( Field  field : fields) {
			System.out.println( field);
		}
				
		
		System.out.println( "클래스 매서드 정보 출력하기===>");		
		Method[] methods  =clazz2.getDeclaredMethods();
		for(  Method  me : methods) {
			System.out.println( me);
		}
		 
		

	}

}
