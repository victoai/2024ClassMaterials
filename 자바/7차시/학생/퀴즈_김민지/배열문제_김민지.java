package day7;

import java.util.Scanner;

public class 배열문제_김민지 {

	public static void main(String[] args) {
		
		/*
		 * 배열문제

			배열은 20개로 준비한다. (약수의 개수를 미리 알지 못하니 넉넉히 20개로 선언한 다음 사용합니다.)
			 ( 임의수는 30을 넘지 않는다)
			어떤 수 입력  ->        어떤수에 대한 약수를 배열에 저장하고 
			                       한꺼번에 출력하는 프로그램 작성
			
			8  ->    1 , 2 ,4 , 8
		 */
		
		int[] arr=new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("30이하의 수를 입력하세요");
		int num=sc.nextInt();
		
		int index=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				arr[index]=i;
				index++;
			}
		}
		
		for(int i=0; i<index; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
