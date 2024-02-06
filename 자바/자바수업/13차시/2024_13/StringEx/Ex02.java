package day13.StringEx;

public class Ex02 {

	public static void main(String[] args) {
		 
		
		String str= new String("hello");
		
		// 문자열  (  속성 (char[] )  + 기능 ( 매서드=>함수 ) 
		
		//문자열수정이 불가
		
		char result  =str.charAt(0);
		System.out.println( result);
		
		// str 문자열 객체의 내용은 바꿀 수 없다.	
		// 원본의 문자열이 수정되는 것은 아니다.
		
		//문자열의 내용을 다르게 대체 (주의 !  새로운 문자열을 반환함)
		String rsult2= str.replace('e', 'a');
		System.out.println( rsult2);
		System.out.println( "원본은 수정되지 않았음=" + str);
				
		//대문자열로 변경
		String result3 =str.toUpperCase();
		System.out.println( result3);
		
		
		String date  = new String("2023-08-03");
		//문자열 분리
		
		// "2023-08-03"  ->
		// String[] r = new String[3];
		// r[0]="2023";
		// r[1]="08";
		// r[2]="03"
		// return r;
		
		String[] result4 = date.split("-");	
		
		for( int i=0 ;i< result4.length ; i++) {
			System.out.println( result4[i]);
		}
		
		//오버로딩  , 매서드이름이 같다  , 식별은 매개변수의 차이로 식별한다
		                 //시작인덱스
		                 //인덱스는 0부터
	  String result5=	date.substring(5);
	  System.out.println( result5);
	  
	                    // 시작인덱스에서 시작 , 끝인덱스 전까지
	 String result6= date.substring(5, 7);
	 System.out.println( result6);	 
	 	  
	 System.out.println( "문자열의 길이=" + date.length());
	  
	  
		 
	 String s1="hello";
	 String s2="hello";
	 //문자열의 비교는  equals() 매서드를 사용해야 합니다. 
	 boolean result7  =s1.equals(s2);
	 System.out.println(  result7);
	 
		
		
		
	}

}
