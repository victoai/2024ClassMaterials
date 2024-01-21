package day5;

import java.util.Scanner;

public class InputSum_2 {

	public static void main(String[] args) {
		
		System.out.println("몇번째 수까지 더할것인지 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}

