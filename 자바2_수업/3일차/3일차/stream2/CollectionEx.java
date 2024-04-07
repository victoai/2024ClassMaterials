package java2.day3.stream2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {
	
		 
		List<String> list  = new ArrayList<>();		
		list.add("hi");
		list.add("hi2");
		list.add("hi2");		
		
		
		int size  = list.size();
		System.out.println( size); 
		
		Set<String> set = new HashSet<>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");
		
		int size2 =set.size();
		System.out.println( size2);				
		
		Iterator<String> r  = set.iterator();	
		
		while( r.hasNext()) {
			String s =r.next();
			System.out.println( s);
		}
		
		Map<String, String > map = new HashMap<>();		
		map.put( "key1", "내용1");
		map.put( "key2", "내용2");
		map.put( "key3", "내용3");
			
		
		String  value  = map.get("key1");
		System.out.println( value);
		
		 

	}

}
