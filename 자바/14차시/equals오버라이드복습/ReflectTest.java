package day14.equals오버라이드복습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			
			//Calculator=reflect.SMCalculator
			BufferedReader br = new BufferedReader ( new FileReader("drink.txt"));	
			 while( true) {
				 String  className  =br.readLine();	 
				 if( className==null) break;
					
				//클래스 정보 동적로딩
				Class clazz = Class.forName(className);
				Student cal =(Student) clazz.newInstance();			
				cal.음료마시기();
				 
			 }
			
			//주의사항  클래스 정보는 패키지를 포함한다
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
