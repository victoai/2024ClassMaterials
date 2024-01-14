package day4;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {

		

		System.out.print("\n--------------2번--------------\n");

		int sum2 = 0;
		Scanner sc2 = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			int x = sc2.nextInt();
			sum2 += x;
		}
		System.out.println("입력된 수의 합 : " + sum2);

		
		
	}

}
