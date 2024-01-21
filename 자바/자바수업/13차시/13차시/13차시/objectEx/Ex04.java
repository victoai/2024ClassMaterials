package week04.day2.objectEx;

public class Ex04 {

	public static void main(String[] args) {


		String str="i like java";		
		
		char result  =str.charAt(0);
		System.out.println( result);
		
		
		String str2 = new String("java");   //힙메모리에 생성
		String str3 = new String("java");		
		if( str2 == str3)
			System.out.println("주소가 같다");
		else
			System.out.println("주소가 다르다");
		
		if( str2.equals(str3)) {
			System.out.println("내용이 같다");
		}
		
		String str4="java";   // 상수영역저장  , 같은것을 공유함 
		String str5="java";		
		if( str4 == str5)
			System.out.println("주소가 같다");		
		else
			System.out.println("주소가 다르다");
		
		if( str4.equals(str5)) {
			System.out.println("내용이 같다");
		}
		
		
		

	}

}
