package prjDay12;

import java.io.IOException;

public class Exception3 {

	
	public static void main(String[] args) {
		
		
		//콘솔로 부터 한 바이트 읽기 		
		int result;
		try {
			result = System.in.read();
			System.out.println( result);
			System.out.println( (char)result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
	}
}
