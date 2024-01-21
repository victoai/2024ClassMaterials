package week04.day4.ExceptionEx;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		int result;
		try {
			System.out.println("나뉨수 입력");
			int divided = sc.nextInt();
			
			System.out.println("젯수를 입력");
			int divisor = sc.nextInt();
			
			result = divided/  divisor;
			System.out.println("결과 :" + result);
		}catch( ArithmeticException e) {
			System.out.println( e.getMessage());
		}
		
		System.out.println("정상종료");
	}

}
