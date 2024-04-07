package java2.day4.변경이유리한코드.animal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader ( new FileReader("src/java2/day4/변경이유리한코드/animal/config.txt"));	
			String  line  =br.readLine();
			System.out.println( line);			
			String[] info =  line.split("=");
			String key  = info[0];
			String value = info[1];
			System.out.println( key);
			System.out.println( value); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
