package prjDay12;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
	 
			Scanner sc = new Scanner(System.in);
			int result;
			System.out.print("나뉨수를 입력:");
			int divided = sc.nextInt();
			System.out.print("나눗수를 입력:");
			int divisor = sc.nextInt();
			try {
				result =divided /divisor;
				System.out.println("결과 :" + result);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("프로그램 정상종료");
		}
	 

}
