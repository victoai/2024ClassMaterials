package reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			
			//Calculator=reflect.SMCalculator
			BufferedReader br = new BufferedReader ( new FileReader("config.txt"));	
			String  line  =br.readLine();
			System.out.println( line);			
			String[] info =  line.split("=");
			String key  = info[0];
			String value = info[1];
			System.out.println( key);
			System.out.println( value);   // 로드해야 할 정보를 파일로 부터 읽어온다
						
			
			//클래스 정보 동적로딩
			Class clazz = Class.forName(value);
			Calculator cal =(Calculator) clazz.newInstance();			
			cal.run();
			 
			
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
