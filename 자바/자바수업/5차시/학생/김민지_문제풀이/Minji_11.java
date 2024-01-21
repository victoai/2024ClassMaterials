package day5;

import java.util.Scanner;

public class Minji_11 {

	public static void main(String[] args) {
	
		// 사용자에게 숫자 n을 입력받아서 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, n번째 줄에는 별 n개를 찍는 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
