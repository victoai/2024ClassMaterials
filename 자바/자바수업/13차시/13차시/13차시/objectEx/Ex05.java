package week04.day2.objectEx;

public class Ex05 {

	public static void main(String[] args) {
		 String str="l like java";
		 String str1 = new String("i like java");
		 
		 //String 불변
		 String result  = str.concat(" hello");
		 System.out.println(  result);
		 
		 
		 //수정가능함 
		 StringBuffer s = new StringBuffer("hello");		 
		 s.setCharAt(0, 'k');
		 s.append("java");
		 System.out.println( s);

	}

}
