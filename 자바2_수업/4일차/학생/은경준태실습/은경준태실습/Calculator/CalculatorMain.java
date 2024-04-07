package java2.calculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import java2.test.panda;

public class CalculatorMain {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InstantiationException, IllegalAccessException, IOException {
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		//int su2 = sc.nextInt();
		
		Calculator cal = getCalculator();
		double result = cal.doubleCal(su1);
		
		System.out.println(result);
		
		
		
	}
	
	private static Calculator  getCalculator() throws ClassNotFoundException, FileNotFoundException, IOException, InstantiationException, IllegalAccessException {
		Properties p = new Properties();
		p.load(new FileReader("src/java2/calculator/config.txt"));
		String className = p.getProperty("cal");
		Class clazz = Class.forName(className);
		Calculator cal = (Calculator)clazz.newInstance();
		
		return cal;
		
	}

}
