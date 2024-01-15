package iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {

	public static void main(String[] args) {
	 
		try {
			
			//byte단위 스트림
			FileOutputStream  fos = new FileOutputStream("output.txt");
			fos.write(100);
			fos.write(98);
			fos.write('b'); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
