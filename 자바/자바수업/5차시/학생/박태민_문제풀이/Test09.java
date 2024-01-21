package day5;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
// 9. 구구단 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();
		}
		
		System.out.println("원하는 구구단 숫자를 입력하세요");
//원하는 단 출력
		Scanner sc = new Scanner(System.in);
		int k;
		k = sc.nextInt();
				
		for(int i=k; ; ) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();
			break;
		}
		sc.close();
	}

}
