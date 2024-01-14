package day15.인터페이스;

import java.util.Scanner;

import day15.정렬.MyComparator;

public class KBJ implements MyRunnable{


	public static void scaleDraw(int n) {
		//위층
		for (int i = 1; i<= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (n-i)*2-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				if(i == n && j ==(i*2)-2) {
					continue;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		//아래층
		for (int i = n-1; i>0; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (n-i)*2-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//스케일 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("스케일 설정 : ");
		int n = sc.nextInt();
		
		//별찍어주는 함수
		scaleDraw(n);
	}

}
