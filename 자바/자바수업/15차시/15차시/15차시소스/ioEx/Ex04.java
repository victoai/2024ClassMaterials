package javaprj.day0207.ioEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args)   {
		 
		
		//버퍼를 이용하여 한번에  여러글자 읽어들이기
		
		// InputStreamReader ir  = new InputStreamReader( System.in);		 
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data = bs.readLine();
			System.out.println( data);
			bs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
