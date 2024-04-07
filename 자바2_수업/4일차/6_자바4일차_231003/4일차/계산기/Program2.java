package java2.day4.변경이유리한코드.계산기;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

//이 프로그램은 계산기를 필요로 한다. 계산기 객체에 의존한다
public class Program2 {
	
	Calculator cal;

	 
	
	
	public void setCal(Calculator cal) {
		this.cal = cal;
	}




	public void run(){
		
		// 두 수를 입력받는다
		Scanner sc = new Scanner(System.in);		
		// 계산기 객체를 통해서 덧셈을 수행한다
		System.out.println( "수 입력");
		int su = sc.nextInt();
		int su2= sc.nextInt();
		// 결과를 출력한다
		
		int result  =cal.add(su, su2);
		System.out.println( result);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Properties  p = new Properties();
		p.load(new FileReader("src/java2/day4/변경이유리한코드/계산기/config.txt"));
		Class clazz =Class.forName( p.getProperty("Calculator"));
		Calculator calculator =(Calculator)clazz.newInstance();
		
		Program2 program = new Program2();
		program.setCal(calculator);
		program.run();
	}

}
