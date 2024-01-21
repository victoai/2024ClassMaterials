package week04.day2.objectEx;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {


		String str="";
		// "stop"이 아닐동안 반복문
		
		Scanner sc = new Scanner(System.in);
		while(true ) {			
			str  =sc.next();
			if( str.equals("stop")) break;
			System.out.println( str);
		}
		
		
		//
		
		
		
		
	}

}
