package day5;

import java.util.Scanner;

public class Multiplication_tables_9 {

	public static void main(String[] args) {
		
		System.out.println("원하는 단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int dan=sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}

}
