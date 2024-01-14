package day04;

import java.util.Scanner;

public class Practice02 {
	
	public static void main(String[] args) {
		
		int num;
		int sum=0;
		 
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sum += num;
		System.out.println("현재까지의 합은 " + sum + " 입니다."  );
		
		
		}
		
	}

}
