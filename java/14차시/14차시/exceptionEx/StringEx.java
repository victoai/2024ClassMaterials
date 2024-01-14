package prjDay12;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String class 는 불변
		String s1="hello";   //문자열상수영역  ( 같은 문자열이 하나만 만들어 짐 , 같이 공유하는 개념)
		String s2="hello";		
		System.out.println(  s1 ==s2);   // 주소를 비교 
		System.out.println(  s1.equals(s2)); // 내용비교   true, false 
		
		String result  =s1.replace('h', 'a');
		System.out.println( result);
		char result2 =s1.charAt(2);
		System.out.println(  result2);
		
		//System.out.println(s1.toString());
		System.out.println(s1);		
		
		String s3 = new String("hello");	  // heap영역에 확보  각 각 객체가 생성됨	 
		String s4 = new String("hello");
		
		System.out.println(  s3 ==s4);
		System.out.println(  s3.equals(s4));
		
				
		//문자열변경  StringBuffer 사용
		StringBuffer  b = new StringBuffer("hello");
		b.setCharAt(1, 'a');
		System.out.println( b);

	}

}
