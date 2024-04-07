package java2.day4.reflect;

import java.lang.reflect.Field;

 

public class  Reflect멤버변수출력하기{

   public static void main( String[] args) throws Exception{

     Class  clazz = Member.class;
     Field  a= clazz.getDeclaredField("id");
    
   
    //객체생성
    Member myclass = new Member();
    String name  = (String) a.get(myclass);
    System.out.println( "name=" + name);

   }
}