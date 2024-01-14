package iostream;

import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {


		
		System.out.println("연속해서 바이트 읽어오기 ");
		try {
			while( true) {
			 int ch = System.in.read();
			 System.out.println( (char) ch);
			 if( ch == '\n') break;    // 엔터문자입력되기 전까지
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
