package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			
			//파일 읽고 쓰기
			
			FileInputStream  fis  = new FileInputStream("img.png");
			FileOutputStream  fos = new FileOutputStream("img4.png");
			
			while( true) {
				  int ch  =  fis.read();
				  System.out.println( ch);
				  fos.write(ch);
				  fos.write(ch);
				 
				  if( ch == -1) break;				
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
