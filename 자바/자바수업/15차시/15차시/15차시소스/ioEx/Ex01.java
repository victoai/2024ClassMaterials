package javaprj.day0207.ioEx;

import java.io.IOException;

public class Ex01 {

	
	// 자바는 표준 입출력스트림제공
	// System.in  //콘솔입력 기반 스트림
	// System.out //콘솔출력 기반 스트림
	public static void main(String[] args) {
		//한바이트로 읽어옴 		
		try {
			int su = System.in.read();
			System.out.println( su);
			su= System.in.read();			
			System.out.println(  su);
			// keycode
			// '0'  ->  48  (48) 
			// '1'  - > 49  
			// 'a'  ->  97  (32)
			// 'A'  ->  65
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 

	}

}
