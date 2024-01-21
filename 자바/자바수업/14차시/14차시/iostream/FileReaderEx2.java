package iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx2 {

	public static void main(String[] args) {
		 
		 try {
			BufferedReader  bf  =  new BufferedReader( new FileReader("name.txt"));	
			 
			while( true ) {
				String name  =bf.readLine();				
				if( name == null) break;
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
