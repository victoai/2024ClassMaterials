package day5;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
// 3. 고객정보(아이디, 이름,  나이 ,키 )입력받아서 출력하기
		System.out.println("당신의 아이디, 이름, 나이, 키를 순서대로 입력하세요");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String name = sc.next();
		int age = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("고객님의 정보는");
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		System.out.println("입니다.");
		sc.close();
	}

}
