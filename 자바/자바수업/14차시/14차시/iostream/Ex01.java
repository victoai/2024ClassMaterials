package iostream;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		 
		 
		
		
		
		//문자  'a'   ->   97    아스키코드,  유니코드  
		//문자는 숫자로 다뤄진다. 문자하나당 숫자하나가 매핑되어 있음
		
		int a ='a';
		System.out.println(  a);
		System.out.println( (char)a);
		
		System.out.println( " 키보드로 한 바이트 읽어온다 , 한글은 깨짐 , 한글 2byte");
		
		try {
			int ch= System.in.read();
			System.out.println(  (char) ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
