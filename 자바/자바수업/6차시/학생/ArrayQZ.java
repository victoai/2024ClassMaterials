package algo.day5;

import java.util.Scanner;
public class ArrayQZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] even = new int[10];
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===문제1====");
		int num = 0;
		int index = 0;
		for(int i=0; i<10; i++) {
			System.out.print("수를 입력하세요 ");
			num = sc.nextInt();
			
			if(num%2==0) {
				even[index] = num;
				index++;
			}
		}
		System.out.println("짝수 출력");
		for(int i=0; i<index; i++) {
			System.out.println(even[i]);
		}
		
		System.out.println("===문제2====");
		
		int num2=0;
		int sum=0;
		int[] total = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print("수를 입력하세요 ");
			num2 = sc.nextInt();
			total[i] = num2;
			sum += num2;
			
		}
		for(int i=0; i<10; i++) {
			System.out.print(total[i]+"  ");
		}
		System.out.println("합은: "+sum);
		

	}

}
