package week04.day4.ExceptionEx;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		 
	  int result=0;
		while(    result != '\n'){				
			result  = System.in.read();
			System.out.print((char) result);
		}
	}

}
