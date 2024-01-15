package java_day7;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		인사하는함수.randomHello();
		
		//두숫자 더하기
		int index= sc.nextInt();
		int index2= sc.nextInt();
		int sum=0;
		
		
		sum1(index, index2);
		
		//별 찍기 문제
		
	int star = 0;
		star(star);

		//원하는 별 찍기문제
		
		int star2 = 0;
		star2(sc, star2);
		
	}
	public static void sum1(int index, int index2) {
		int sum;
		sum =index+index2;
		
		System.out.println(sum);
	}
	//안녕하세요문제
	public static void hello() {
		int randomNumber  =  (int) (Math.random()*1);
		
		System.out.println("ㅎㅇ");
	}
	//원하는별찍기
	public static void star2(Scanner sc, int star2) {
		int index= sc.nextInt();
		for(int i=0 ; i<=index ; i++) {
			star2+=i;
			System.out.print("*");}
	}
	//별다섯개찍기
	public static void star(int star) {
		for(int i=0 ; i<=5 ; i++) {
			star+=i;
			System.out.print("*");
	}
		

	
	}

	
}
