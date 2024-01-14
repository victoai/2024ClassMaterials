package javalang.day4;

import java.util.Scanner;

public class 약수구하기 {

	public static void main(String[] args) {
		//어떤수에 대한 약수를 배열에 저장하고 
        //한꺼번에 출력하는 프로그램 작성 (단, 입력값 30이하)
		int[] result = new int[20];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		//입력 부분
		System.out.print("수를 입력하세요 = ");
		int input = sc.nextInt();
		
		//약수 구해서 배열에 저장 (for문 횟수 줄이기)
		for(int i=1; i<=input/2; i++) {
			if(input%i == 0) {
				result[count] = i;
				count ++;
			}
		}
		//입력값 마지막 배열에 저장
		result[count++] = input;
		System.out.printf("%d의 약수 =",input);
		
		//저장된 약수배열 출력
		for(int i=0; i<count; i++) {
			System.out.printf(" %d ",result[i]);
		}
	}

}
