package iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReader고객 {

	public static void main(String[] args) {
	 
		  try {
			  
			  //문자 단위  읽기
			FileReader fis = new FileReader("res/acorn2.txt");
			BufferedReader br  = new BufferedReader( fis);  //  null로 반복문 종료
			 
			
		    while( true){
		    	
		    	
		    	String line  = br.readLine();		    	
		 
		    	if(  line == null) break;		 
				
		    	String[]  c  = line.split(",");		    	
		    	String name = c[0];
		    	int age  = Integer.parseInt( c[1]);		    	
		    	Customer customer  = new Customer(  name , age); 		    	
		    	System.out.println( customer);
		    	
		    	
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
