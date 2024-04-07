package java2.day3.stream2;

import java.util.ArrayList;

public class WrapperEx {

	public static void main(String[] args) {

		Integer i1 = new Integer(3);
		Integer i2=3;
		// int => Integer      
		// double  => Double
		
		int sum = i1.intValue() + i2.intValue();
		int sum2 = i1+ i2;
		System.out.println(sum);
		System.out.println( sum2);		
				
		ArrayList<Object> list = new ArrayList<>();		
		list.add( new Integer(4));
		list.add(5);				
		int su = (Integer) list.get(0);		
		System.out.println( su);
		 
		

	}

}
