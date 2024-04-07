package java2.day3.collection;

import java.util.LinkedList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		//List<String>   list  = new ArrayList<>();   // 연속적으로 		 
		List<String>     list  = new LinkedList<>();   // 다음요소의 주소를 기억하는 방식   		
		list.add("hi");		
		list.add("hi2");
				
		String result  = list.get(0);
		String result2 =  list.get(1);
		
		
		System.out.println( result) ;
		System.out.println( result2) ;
		
		

	}

}
