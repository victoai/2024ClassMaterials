package java2.day3.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) {
		 
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("bye");
		list.add("hello");
		list.add("bye"); 
		
		long cnt  = list.stream().filter( str-> str.equals("hello")).count();
		System.out.println( cnt);		
		list.stream().filter( str-> str.equals("bye")).forEach( s ->System.out.println(s));
				
		String[] list2 = new String[6];
		list2[0]="hi";
		list2[1]="hello";
		list2[2]="hello";
		list2[3]="bye";
		list2[4]="hello";
		list2[5]="bye";		
		Arrays.stream(list2).filter( str-> str.equals("hello")).forEach( s ->System.out.println(s));
		Arrays.stream(list2).filter( str->str.equals("hello")).limit(2).forEach( s  -> System.out.println(s)); 
		Arrays.stream(list2).sorted().forEach( s->System.out.println(s));
		
		//IntStream s = new Random().ints(1,46);
		Random r = new Random();
		IntStream    ir  = r.ints(1,46);
		System.out.println(" lotto number");
		ir.distinct().limit(6).sorted().forEach( x -> System.out.println(x));
		
		
		
		
		
				
	}

}
