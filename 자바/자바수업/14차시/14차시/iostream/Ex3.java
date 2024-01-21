package iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) {

		// 여러문자를 한꺼번에 읽어 온다
		// 버퍼에 담아서 한꺼번에 읽어온다
		BufferedReader  b = new BufferedReader( new InputStreamReader(System.in));		
		try {
			String str =	b.readLine();
			System.out.println( str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
