package java2.day3.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {	
		
		
		try {
			Properties  p = new Properties();	
			p.load( new FileReader("config.txt"));			
			String name  = p.getProperty("animal");
			System.out.println( name);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
