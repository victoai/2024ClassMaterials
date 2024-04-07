package java2.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// 표준화된 방법으로 데이터를 다루겠다.  진정한  표준화	
		 
		//String[] arr =  { "one" , "two" , "three" } ;
		String[] arr= new String[] { "one" ,"two" ,"three"};
		
		ArrayList<String> list  = new ArrayList<>();
		list.add("one");
		list.add( "two");
		list.add("three");		
				
		//배열정렬
		Arrays.sort(arr);			
		//Collection 정렬
		Collections.sort(list);
		
		//출력		
		for( String s:  arr) {
			System.out.println( s);
		}
		
		for(String s: list) {
			System.out.println( s);
		}	 
		
		//배열을 스트림으로 	 
		Stream<String> stream1 = Arrays.stream(arr);
		//ArrayList를 스트림으로
		Stream<String> stream2 = list.stream();			
		stream1.sorted().forEach( s->System.out.println(s));
		stream2.sorted().forEach( s->System.out.println(s)); 
		
		 
	}

}
