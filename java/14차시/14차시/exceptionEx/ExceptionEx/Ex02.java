package week04.day4.ExceptionEx;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {

		// 한 바이트입력 
		

		
		try {
			int result = System.in.read();
			System.out.println( result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
		
		
	}

}
