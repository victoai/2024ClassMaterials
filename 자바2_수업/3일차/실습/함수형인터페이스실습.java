package java2.day3.실습;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 함수형인터페이스실습 {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			System.out.println("ddd");
		};
		
		r.run();		
		
		Consumer<String> c = item -> System.out.println( item);
		c.accept("하이 consumer");
		
		
		Supplier<String> s =  () ->  "웃긴이야기";
		
		System.out.println( s.get());
		
		
		Predicate<Integer> p =  su -> (su%2==0)?true:false;
		
		boolean result  =p.test(5);
		System.out.println( result);
		
		
		Function<Integer , Integer> f =  su ->  (int)(su/2) ;
		
		int result2= f.apply(4);
		System.out.println( result2);
		
		

	}

}
