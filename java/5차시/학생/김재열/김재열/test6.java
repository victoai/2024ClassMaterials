package 문법.day4;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("10개의 랜덤 수를 입력하세요:");

		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.println("입력한 랜덤 수 중 짝수의 합: " + sum);
	}

}
