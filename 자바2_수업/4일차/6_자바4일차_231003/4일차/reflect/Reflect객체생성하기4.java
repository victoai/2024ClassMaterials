package java2.day4.reflect;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect객체생성하기4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String value ="";
		try {
			BufferedReader br = new BufferedReader ( new FileReader("src/java2/day4/reflect/config.txt"));	
			String  line  =br.readLine();
			System.out.println( line);			
			String[] info =  line.split("=");
			String key  = info[0];
			 value = info[1];
			System.out.println( key);
			System.out.println( value); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//클래서정보 얻어오기 
		Class  clazz = Class.forName(value);	
		//클래스정보를 이용하여 객체생성하기		
		Member member = (Member)clazz.newInstance() ; // 기본생성자를 이용하여 객체를 생성한다
		
		System.out.println( member);
		 
		
		
		
	}

}
