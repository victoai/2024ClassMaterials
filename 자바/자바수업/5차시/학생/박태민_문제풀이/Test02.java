package day5;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
// 2. 사용자로부터 수를 입력받아 입력받은 수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
				
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("입력받은 수는 : " + num + "입니다.");
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
		sc.close();
		} 
}
