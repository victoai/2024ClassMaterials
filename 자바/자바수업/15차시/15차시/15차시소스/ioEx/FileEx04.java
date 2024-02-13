package javaprj.day0207.ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx04 {

	public static void main(String[] args) {		
		try {
			BufferedReader bf = new BufferedReader( new FileReader("res/acorn.txt"));			
			while(true) {
				String data = bf.readLine();
				if( data == null)break;
				System.out.println( data);
			}			
			
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}

}
