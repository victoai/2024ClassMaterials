package day5;

import java.util.Scanner;

public class EvenSum_6 {

	public static void main(String[] args) {
		
		System.out.println("수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		for(int i=0; i<10; i++) {
			int number=sc.nextInt();
			
			if(number%2==0) {
				sum=sum+number;
			}
		}
		
		System.out.println(sum);
		
		

	}

}
