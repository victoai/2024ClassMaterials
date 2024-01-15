package day5;

import java.util.Scanner;

public class InfoPrint_3 {

	public static void main(String[] args) {
		
		System.out.println("아이디, 이름, 나이, 키를 입력하세요");
		Scanner sc=new Scanner(System.in);
		String id=sc.next();
		String name=sc.next();
		int age = sc.nextInt();
		int height=sc.nextInt();
		
		System.out.println("아이디: "+id);
		System.out.println("이름: "+ name);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);

	}

}
