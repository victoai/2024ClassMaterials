package day4;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {

		
		System.out.print("\n--------------9번--------------\n");
		
		System.out.println("구구단 중 원하는 단을 입력하세요.");
		Scanner sc9 = new Scanner(System.in);
		int a9 = sc9.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(a9 + " * " + i +" = " + a9*i);
		}
		
		
		
	}

}
