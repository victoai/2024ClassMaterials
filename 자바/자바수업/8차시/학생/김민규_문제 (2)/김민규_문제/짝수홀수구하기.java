package java_day7;

import java.util.Scanner;

public class 짝수홀수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		
		index();
		
		
	}

	public static void index() {
		int a =0;
		int b =0;
		
		for(int i =0; i<=10; i++) {
			
			if(i%2==0) {
				a=i;
				System.out.println("짝"+a);
			}else {
				b=i;
				System.out.println("홀"+b);
			}
		
			
		}
	}

}
