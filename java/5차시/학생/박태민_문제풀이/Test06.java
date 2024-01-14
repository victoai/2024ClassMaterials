package day5;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
// 6. 수를 입력받아 짝수의 합을 구하세요 (10개의 수를 입력)
		System.out.println("수를 10번 입력하세요");
		Scanner sc =new Scanner(System.in);
		int i=0;
		int num;
		int sum=0;
	
		while (i<10) {
			num = sc.nextInt();
			i++;
			if(num%2 != 0){
				continue;
			}else {
				sum+=num;
			}
		}System.out.println("입력하신 10개의 수 중 짝수의 합은 : " + sum + "입니다.");
		sc.close();
	}

}
