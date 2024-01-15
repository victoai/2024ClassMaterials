package day15.인터페이스;

import java.util.Scanner;

public class multi_kdy implements MyRunnable{

		@Override
		public void run() {
					
			System.out.println("곱하기를 원하는 두 수를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int su = sc.nextInt();
			int su2 = sc.nextInt(); 
			int result = su*su2;
			System.out.println(result);
		    
			
		}
	
	
	
}
