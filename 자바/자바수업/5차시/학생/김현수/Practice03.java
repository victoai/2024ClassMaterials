package day04;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		String id;
		String name;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		id = sc.next();
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();
		
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);		
	
	}
}
