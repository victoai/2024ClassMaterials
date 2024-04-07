package java2.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Acorn메서드호출하기 {
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Acorn a = new Acorn();
	a.printInfo();
	
	Class clazz =Class.forName("java2.test.Acorn");
	
	Method method = clazz.getDeclaredMethod("printInfo");
	method.invoke(a);
}
}
