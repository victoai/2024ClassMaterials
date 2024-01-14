package day15.인터페이스;

import java.util.Scanner;

public class 김민지클래스 implements MyRunnable{

	@Override
	public void run() {
		
		System.out.println("몇개의 별을 찍을지 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		for(int i=0; i<su; i++) {
			System.out.print("*");
		}
	}
}
