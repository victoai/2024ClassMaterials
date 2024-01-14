package day4;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {

		
		System.out.print("\n--------------11번--------------\n");
		
		System.out.println("Q. 1부터 100까지 사이에 소수를 찾으시오.");
		
		for(int i =1; i<=100; i++) {
			for(int j =1; j<=i; j++) {
				if((double)i/j!=1){
					continue;
				}
				System.out.print(i + ", ");
			}
			
			
		}
		
		
	}

}
