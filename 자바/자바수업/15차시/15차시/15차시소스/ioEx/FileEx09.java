package javaprj.day0207.ioEx;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileEx09 {

	public static void main(String[] args) {		 
	 
			try {
				ObjectInputStream oi = new ObjectInputStream(  new FileInputStream("output2.txt"));				
	
				while(true) {
					Score  s = (Score)oi.readObject();
					System.out.println( s);									
				}			
				
			}catch(EOFException e) {
		    	  System.out.println(" 다 읽었음");		     
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		

	}

}
