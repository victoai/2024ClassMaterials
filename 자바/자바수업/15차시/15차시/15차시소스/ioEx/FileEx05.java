package javaprj.day0207.ioEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx05 {

	public static void main(String[] args) {
	 
		
		try {
			BufferedReader bf = new BufferedReader( new FileReader("res/kor.txt"));
			
			int sum=0;
			double avg;
			int count=0;
			while(true) {
				String data = bf.readLine(); 
				count++;
				if( data == null)break;
				System.out.println( data);
				int dataNumber  =  Integer.parseInt(data);
				sum +=  dataNumber; // sum = sum+  dataNumber;
			}	
			avg =sum/count;
			System.out.println( avg);
			
			
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
