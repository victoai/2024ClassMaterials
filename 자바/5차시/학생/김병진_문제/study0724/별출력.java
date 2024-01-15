package study0724;

import java.util.Scanner;

public class 별출력 {

	public static void main(String[] args) {
		// 스케일 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("스케일 설정 : ");
		int n = sc.nextInt();
		
		//위층
		for (int i = 1; i<= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < (n-i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
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
			for (int j = 0; j < (n-i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
