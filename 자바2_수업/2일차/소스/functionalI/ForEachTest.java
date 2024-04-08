package day2.lamda.functionalI;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachTest {

	public static void main(String[] args) {
		 /*
		  * 장주원  
이미현 
김두식
전계도
프랭크
김봉석
장희수
이강훈 
		  */
		 ArrayList<String> list = new ArrayList<>();
		 list.add("장주원");
		 list.add("이미현");
		 list.add("김두식");
		 list.add("전계도");
		 list.add("프랭크");
		 list.add("김봉석");
		 list.add("이강훈");
		 
		 //출력
		 System.out.println( "===================>");
		 for( int i=0;i< list.size(); i++) {
			 System.out.println( list.get(i));
		 }		 
		
		 System.out.println( "===================>");
		 for( String  name : list) {
			 System.out.println( name);
		 }
		 
		 //인터페이스를 구현하는 방법  1. 이름있는 클래스작성  2.익명클래스  3.람다식으로 작성
		 //functional interface( 한 개의 추상매서드만을 가지는 인터페이스)
		 
		 //1.
		 class A implements Consumer<String>{
			@Override
			public void accept(String t) {
				 System.out.print( t +", ");
				
			}			 
		 }
		 System.out.println( "forEach 1===================>");	
		 list.forEach(new A());		 
		 
		 //2.
		 System.out.println( "\n forEach 2===================>");	
		  list.forEach( new Consumer<String>() {

			@Override
			public void accept(String t) {
				  System.out.println( t );				
			}});
		 
		 //3.
		 System.out.println( "\nforEach 3===================>");		 		 
		 list.forEach(  item -> System.out.println( item));
		
		 
		 
		

	}

}
