package day5.functionalInterface;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList_forEach {

	public static void main(String[] args) {		 
		
		ArrayList<String> list =new ArrayList<>();		
		list.add("서울");
		list.add("대전");		
		list.add("부산");
		
		
		
		
		
		//반복하는함수  =>반복하면서 해야할 일을 알려줘
		//    
		//list.forEach();
		System.out.println("=========>");
		list.forEach( item -> System.out.println( item));		
		
		/* interface consumer<T>{
		 *   void accept( T t );
		 *   
		 * }
		 */
		
		System.out.println("=========>");
		list.forEach(  item  -> System.out.println( item)  );
		
		
		
		//list.forEach( new Consumer<>() {} );
		System.out.println("=========>");
		list.forEach( new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println( t);
			}} );	
		
		
		class ConsumerImp implements  Consumer<String>{

			@Override
			public void accept(String t) {
				  System.out.println( t);				
			}			
		}
		System.out.println("=========>");
		list.forEach( new  ConsumerImp());
		
		
		
		
	}

}
