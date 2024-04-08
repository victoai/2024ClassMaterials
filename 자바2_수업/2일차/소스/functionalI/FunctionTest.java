package day2.lamda.functionalI;

import java.util.function.Function;

/*
 * 
 * interface Function<T, R>{
 *    R  apply( T);
 * }
 * 
 */
public class FunctionTest {

	public static void main(String[] args) {
		
		 Function<Integer, Integer> f1 =  su ->  su*2;
		 
		 int result1= f1.apply(10);
		 System.out.println( result1);
		 
		
		 Function<Integer, Integer> f3=   new Function<>() {

			@Override
			public Integer apply(Integer t) {
				 
				return t*2;
			}};
		 
		int result2 = f3.apply(1000);
		System.out.println( result2);
		
		
		Function<Integer, String>  f4 =  num  -> {
			  String re="";
			  for( int i=1 ; i<= num  ;i++) {
				  re+="람다좋아 " ; 
			  }			  
			  return re;
		};
		
		String result3 =f4.apply(2);
		System.out.println( result3);
		
		
		String result4 =f4.apply(1);
		System.out.println( result4);
		
		
		 
	}

}
