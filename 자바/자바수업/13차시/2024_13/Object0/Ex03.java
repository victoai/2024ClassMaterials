package week04.day2.objectEx;

import week04.day1.Score;

public class Ex03 {

	public static void main(String[] args) {
		Customer c = new Customer("k100" ,"1234");
		Customer c2 = new Customer("k100" , "1234");				
		boolean result  = c.equals(c2);  //결과는  true? false?
		System.out.println( result);
		
		//c.equals(new Score() );
		
	 
	}

}
