package day4;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {

		
		System.out.print("\n--------------6번--------------\n");

		Scanner sc6 = new Scanner(System.in);
		int sum = 0;
		int a6;
		for (int i = 1; i <= 5; i++) {
			a6 = sc6.nextInt();
			if (a6 % 2 == 1) {
				continue;
			}
			sum += a6;
		}
		System.out.println("입력된 수 중 짝수의 합 : " + sum);
		 
		
		
		
		
		
	}

}
