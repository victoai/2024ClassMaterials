package java2.day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		 
		//중복허용, 순서가 있음 
		List<String>   list  = new ArrayList<>();
		list.add("hi");
		list.add("hi2");
		list.add("hi2");
		
		/*
		for( String str : list) {
			System.out.println( str);
		}
		*/
		//
		Set<String>  set = new HashSet<>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");				
		/*
		Iterator<String> list2 = set.iterator();		
		while(list2.hasNext() ) {
			System.out.println( list2.next() );
		}
		*/		
		Map<String, String>  map = new HashMap<>();		
		map.put("key1", "test1내용");
		map.put("key2", "test2내용");
		map.put("key3", "test3내용");				
		String content = map.get("key1");
		System.out.println( content); 
				
		
		//Iterator => Collection으로 표준화된 방법으로 다룰 때 사용한다
		 System.out.println(" ============================================");
		 Collection<String> collection= null;  // Collection type 참조형 변수
		 //상속관계의 다형성
		
		  collection  = list;       // 가능
		//  collection  =  set ;      // 가능    
		  Iterator<String>  iterator1=  collection.iterator();
		 
		  while(iterator1.hasNext() ) {
			  System.out.println( iterator1.next());
		  }
		 
		  
		
	}

}
