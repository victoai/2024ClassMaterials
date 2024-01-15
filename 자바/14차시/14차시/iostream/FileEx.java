package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		
		
		// 파일을 대상으로 한바이트씩 읽어온다 . 한글은 깨짐
		 try {
			FileInputStream  fis  = new FileInputStream("input.txt");
			//파일에 대한 기반  읽어오는 스트림 얻어오기
			int ch  =fis.read();
			System.out.println(  (char) ch);
			
			  ch  =fis.read();
			System.out.println(  (char) ch);
			
			  ch  =fis.read();
			System.out.println(   (char) ch);
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
