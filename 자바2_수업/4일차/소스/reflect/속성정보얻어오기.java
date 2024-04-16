package day4.reflect;

import java.lang.reflect.Field;

public class 속성정보얻어오기 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class  clazz1 = Class.forName("day4.reflect.Member");

		
		Field fields[] = clazz1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println( field);
		}
		
	}

}
