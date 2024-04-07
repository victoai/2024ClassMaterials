package java2.generic.arraylist;

import java.util.ArrayList;

 

public class MyArrayListTest {

	public static void main(String[] args) {
		
		MyArrayList  arrys = new MyArrayList ();
		Student a= new Student("김길동","하남시" );
		Student b= new Student("강길동","부산시" );
		Student c= new Student("나길동","제주도" );
		arrys.add(a);
		arrys.add(b);
		arrys.add(c);
		
		
		
		arrys.forEach( new MyConsumer(){

			@Override
			public void accept(Object t) {
				
				System.out.println( t);
			}});
		
		
		arrys.forEach( item -> System.out.println(item));

	}

}
