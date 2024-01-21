package prjDay11.runnable;

import java.util.Scanner;

public class PGHRun implements MyRunnable{

	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단");
		System.out.print("출력하고 싶은 구구단 숫자를 입력하세요:");
		int n = sc.nextInt();
		System.out.println("구구단 " + n + "단 출력");
		for(int i=1; i<=9; i++) {
			System.out.println(n + "*" + i + "=" + n*i);
		}
	}

}
