package iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
	 
		  try {
			  
			  //문자 단위  읽기
			FileReader fis = new FileReader("b.txt");
			int ch =fis.read();
			System.out.print( (char) ch);
			
		    ch =fis.read();
			System.out.print( (char) ch);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
