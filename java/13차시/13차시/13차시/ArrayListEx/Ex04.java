package week04.day2.ArrayListEx;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {


		ArrayList list = new ArrayList();				
		list.add(3);
		list.add(7);
		
		
		// auto boxing 
		Integer i1 = new Integer(3);
		Integer i2 = 3; 
		int sum2 = i1.intValue() + i2.intValue();
		// auto unboxing
		int sum = i1 +i2;
		System.out.println("합=" + sum + "합2=" + sum2);
	}

}
