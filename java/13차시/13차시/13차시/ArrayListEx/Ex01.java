package week04.day2.ArrayListEx;

import java.util.ArrayList;

public class Ex01 {
	
	public static void main( String[] args) {
		 
		
		// 순서있고, 중복허용 가능  , 가변길이 배열  add, get 
		ArrayList list = new ArrayList();
		list.add(new Score("hong",100,100));
		list.add(new Score("kim",90,99));
		list.add(new Score("lee",88,100));
		
		
		for( int i =0  ; i< list.size() ; i++) {
			 //  list.get(i).toString();
			System.out.println( list.get(i));			    
		}
		
		
	}

}
