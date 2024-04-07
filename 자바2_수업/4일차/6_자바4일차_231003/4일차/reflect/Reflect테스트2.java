package java2.day4.reflect;

import java.lang.reflect.Field;

class MyClass{
    private String name="리플렉트";
}

public class  Reflect테스트2{

   public static void main( String[] args) throws Exception{

     Class<MyClass> clazz = MyClass.class;
     
 	
      Field[] fields = clazz.getDeclaredFields();
		
		for( Field f: fields){
			System.out.println( f);
		}
	
     Field  a= clazz.getDeclaredField("name");
     a.setAccessible(true);
   
    //객체생성
    MyClass myclass = new MyClass();
    String name  = (String) a.get(myclass);
    System.out.println( "name=" + name);

   }
}