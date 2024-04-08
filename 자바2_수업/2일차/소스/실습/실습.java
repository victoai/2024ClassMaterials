package day2.lamda.실습;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<String >  s =  () -> "탕수육";
		
		Predicate<String>  p =   food -> food.equals("탕수육")?true:false;
		
		boolean result  =p.test(s.get());
		System.out.println( result);
		
		
		
		

	}

}
