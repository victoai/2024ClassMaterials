package iostream;

import java.io.IOException;
import java.io.InputStream;

public class Ex05 {

	public static void main(String[] args) {
	 

		
		try {
			int ch  = System.in.read();
			System.out.println( (char) ch);
			
			
		     ch  = System.in.read();
			System.out.println( (char) ch);
			
			
			
			 ch  = System.in.read();
			System.out.println( (char) ch);
			
			
			
		     ch  = System.in.read();
			System.out.println( (char) ch);
			
			InputStream  r= System.in;
			int result  = r.read();
			System.out.println(  result);
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
