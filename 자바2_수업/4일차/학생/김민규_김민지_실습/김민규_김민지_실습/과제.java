package 김민규_김민지_실습;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
	
		
		
		Cafe c = getCafe();
		c.pet();
		
	}
	
	private static Cafe getCafe() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties p = new Properties();
		p.load(new FileReader("src/김민규_김민지_실습/config.txt"));
		String className = p.getProperty("cafe");
		Class clazz = Class.forName(className);
		Cafe cafe = (Cafe) clazz.newInstance();
		
		return cafe;
	}
}
