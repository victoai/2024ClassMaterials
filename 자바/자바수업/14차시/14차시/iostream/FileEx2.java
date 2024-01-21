package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) {
	 
		 try {
			 
			FileInputStream  fis  = new FileInputStream("input.txt");
			
		  while(true) {			  
			  int ch  = fis.read();
			  System.out.print(  (char) ch);
			  if( ch == -1)    // 파일의 끝 
				      break;
		  }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 

	}

}
