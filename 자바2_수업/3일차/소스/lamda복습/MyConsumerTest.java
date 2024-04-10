package day3.day3.lamda복습;

import java.util.function.Consumer;

@FunctionalInterface
	interface MyConsumer2<T> {
		void accept( T str); // 입력이 있고 반환이 없다.

	}


public class MyConsumerTest {

	public static void main(String[] args) {
		
		//지역내부클래스 (매서드 안에서 선언된 클래스) 
		class MyConsumerImp2 implements MyConsumer2<String> {
			@Override
			public void accept(String str) {
				System.out.println( str );
			} 
		 }
		
		// 1. 
		 MyConsumerImp2 obj = new MyConsumerImp2(); 
		 obj.accept("hello");
		
		 //2. 익명클래스작성
		MyConsumer2<String> obj2 = new MyConsumer2<>() {
			@Override
			public void accept(String str) {
			System.out.println( str );
			} 
		 };
		 
		//3.람다식
		MyConsumer2<String> obj3 = str -> System.out.println(str);
		MyConsumer2<Integer> obj4 = num -> System.out.println( num*num); 
		 
	    obj3.accept("문자열");
		obj4.accept(7);
		
		
		//자바가 제공하는 Consumer 인터페이스 사용하기
		Consumer<String> obj5 = str ->  System.out.println(str);
		Consumer<Integer> obj6 = num -> System.out.println( num*num); 
		obj5.accept("문자열");
		obj6.accept(7);
		
	}
}
