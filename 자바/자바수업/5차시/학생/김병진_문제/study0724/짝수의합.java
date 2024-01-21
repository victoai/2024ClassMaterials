package study0724;

import java.util.Scanner;

public class 짝수의합 {

	public static void main(String[] args) {
		// 수를입력받아서 짝수의 합을 구하세요 ( 10개의 수를 입력)
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.print(i+1 + "번째 수를 입력하세요 : ");
			int number = sc.nextInt();
			
			if(number%2 == 0) {
				sum += number;
			}
		}
		System.out.println("\n짝수의 합 : " + sum);
	}
}
