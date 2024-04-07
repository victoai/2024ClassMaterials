package 실습;

import java.util.Arrays;
import java.util.Scanner;

public class 실습_Runnable {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			Scanner sc= new Scanner(System.in);
			System.out.println("버킷리스트를 3개만 입력하세요");
			String[] b = new String[3];
			
			for(int i=0; i<3; i++){
				b[i] = sc.next();
			}
			
			Arrays.stream
			(b).forEach(x -> System.out.println(x));

		};
		
		r.run();

	}

}
