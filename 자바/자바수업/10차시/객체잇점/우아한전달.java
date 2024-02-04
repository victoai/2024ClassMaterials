package javaprj.day0201;

public class 우아한전달 {
	
	public static void main(String[] args) {
		
		String name="장유나";
		int age=20;
		String address="인천시";
		
		
		///
		printInfo( name, age, address);		
		Customer c = new Customer();		 
		c.name="장유나";
		c.age=20;
		c.address="인천시";		
		
		printInfo2( c);
		
	}
	
	
	public static void printInfo(  String name, int age, String addr) {		
		System.out.println( name);
		System.out.println( age);
		System.out.println( addr);		
	}
	
	
	public static void printInfo2(  Customer c) {		
		System.out.println( c.name);
		System.out.println( c.age);
		System.out.println( c.address);		
	}
	
	
}
