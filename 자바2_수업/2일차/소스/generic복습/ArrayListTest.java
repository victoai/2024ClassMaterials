package day1.generic.generic복습;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {	 
		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score( "홍길동", 99 ,100));
		list.add( new Score( "김길동", 100,99));
		
		for( int i=0; i< list.size() ; i++) {
			System.out.println( list.get(i));
		}
		

	}

}
