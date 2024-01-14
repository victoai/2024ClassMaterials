package iostream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) {

		//키보드로부터 한 문자씩 읽어옴  , 이때  InputStreamReader라는 보조스트림을 사용함 
		InputStreamReader r = new InputStreamReader(System.in);
		   
		//보조        //기반스트림 (키보드로부터 데이터 읽어올 수 있는 스트림) 
		
		
		System.out.println(" 키보드로 한 문자 읽어오기 ");
		try {
			int ch  = r.read();			
			System.out.println((char) ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
