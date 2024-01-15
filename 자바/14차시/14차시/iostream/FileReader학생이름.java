package iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader학생이름 {

	public static void main(String[] args) {
	 
		  try {
			  
			  //문자 단위  읽기
			FileReader fis = new FileReader("res/acorn.txt");
			BufferedReader br  = new BufferedReader( fis);
			 
			
		    while( true){
		    	
		    	
		    	String fullName  = br.readLine();					
		    	if(  fullName == null) break;
				String name  = fullName.substring(1);				
				System.out.println( name);
				
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
