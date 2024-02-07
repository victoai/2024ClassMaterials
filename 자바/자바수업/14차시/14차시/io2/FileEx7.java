package javaprj.day0207.ioEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileEx7 {

	public static void main(String[] args) {
	 
		Score s = new Score("홍길동", 100);
		Score s2 = new Score("김길동",80);
		
		try {
			ObjectOutputStream  os = new ObjectOutputStream
			          ( new FileOutputStream("res/output2.txt"));
			
			os.writeObject(s);
			os.writeObject(s2);
			os.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
