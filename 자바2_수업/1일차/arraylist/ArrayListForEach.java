package java2.generic.arraylist;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListForEach {

	public static void main(String[] args) {
		ArrayList<Student> arrys = new ArrayList<>();
		Student a= new Student("김길동","하남시" );
		Student b= new Student("강길동","부산시" );
		Student c= new Student("나길동","제주도" );
		arrys.add(a);
		arrys.add(b);
		arrys.add(c);
		
		 
		
		//1.
		class ConsumerImp implements Consumer<Student>{

			@Override
			public void accept(Student t) {
				
				  System.out.println( t);
			}
			
		}		
		
		arrys.forEach( new ConsumerImp());
		
		
		
		// 2.
		
		arrys.forEach(  new Consumer<>(){

			@Override
			public void accept(Student t) {
				
				  System.out.println( t);
			}});
		
		//3
		
		arrys.forEach( item -> System.out.println(item));
	}

}
