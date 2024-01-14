package 자바문제_문나정;

import java.util.Scanner;
public class Qz_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("아이디를 입력하세요 ");
		String id = sc.next();
		
		System.out.printf("이름 입력하세요 ");
		String name = sc.next();
		
		System.out.printf("나이를 입력하세요 ");
		int age = sc.nextInt();
		
		System.out.printf("키를 입력하세요 ");
		int height = sc.nextInt();
		
		System.out.println("아이디: "+id+"  이름: "+name+"  나이: "+age+"  키: "+height);
		

	}

}
