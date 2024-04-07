package java2.day3.stream2;

public class StringEx {

	public static void main(String[] args) {


		String str="java";		
		boolean result0 = str.equals("java");
		boolean result1 = str.equalsIgnoreCase("Java");
		boolean result2 = str.endsWith("a");
		boolean result3  = str.startsWith("j");
		boolean result4 =  str.contains("v");		
		
		System.out.println(  result0);
		System.out.println(  result1);
		System.out.println(  result2);
		System.out.println(  result3);
		System.out.println(  result4); 
		

	}

}
