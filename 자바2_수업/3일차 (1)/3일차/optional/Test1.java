package java2.day3.optional;

import java.util.Optional;

public class Test1 {

	 
	public static void main(String[] args) {
		 
		
	 	// Optional 객체생성
		//String str="hello optional";
		String str= null;
	    Optional<String> obj  = Optional.ofNullable(str);
		String result  = obj.orElse("빈문자열");
		System.out.println(  result);				
		
		//str="hello";		
		/*
		if( str != null) {
			System.out.println( str.length() +"문자길이");
		}else {
			System.out.println("빈문자열입니다");
		}
		*/
		
		
		// null인경우에 대비한  예외처리코드 
		try {
			 if( str.length() >0 ) System.out.println( "0보다 크다");
			
		}catch(Exception  e) {
			System.out.println("값이 비어 있어요");
			
		}

	}

}
