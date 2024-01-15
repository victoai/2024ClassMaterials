package day0724;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {

		System.out.print("\n--------------11번--------------\n");

		System.out.println("Q. 1부터 100까지 사이에 소수를 찾으시오.");

		for (int i = 2; i <= 100; i++) { // 판별할 수
			for (int j = 2; j < i; j++) { // 판별할 수를 2부터 나누기
				if (i%j == 0) { // 나머지가 0이면 약수이므로 다음 수 판별
					break;
				}else if(i/j == 1) { // 나머지가 0이 아니면서 몫이 정수로 1이되면 소수
					System.out.print(i + ", ");
					break;
				}
			}
		}
	}

}
