package day15.인터페이스;

import java.util.Scanner;

public class Jiwon implements MyRunnable {

	@Override
	public void run() {
		System.out.println("원하는 단을 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = num; i <= num; i++) {
			for(int j=1; j<=9; j++) {
			System.out.println(i+"x"+j+"="+i*j);	
			}
		}

	}

}
