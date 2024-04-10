package day3.day3.lamda복습;

import java.util.function.Supplier;

/*
 *  interface Supplier<T>{
 *     T get( );
 *  }
 * 
 * 
 */
public class SupplierTest4 {

	public static void main(String[] args) {
		// int  -> Integer 
		// double -> Double
		
		Supplier<Integer> s1 =  () -> (int) (Math.random()*5);
		int result =s1.get();
		System.out.println( result);
		
		
		Supplier<String> s2 = ( ) -> {
			int  randomNumer =(int)  (Math.random()*2) ;
			if( randomNumer ==0) {
				return "좋다 ";
			}else {
				return "더 좋다";
			}	 
		};
		
		String result2=s2.get();
		System.out.println( result2);
		
		
		Supplier<Integer> s3 = new Supplier<>() {

			@Override
			public Integer get() {				 
				return (int) (Math.random()*5);
			}};		
		
		int result3 = s3.get();
		System.out.println( result3);
		
		
		

	}

}
