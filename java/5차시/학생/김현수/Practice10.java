package day04;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		int num;
		int menu;
		System.out.println("메뉴를 고르세요!");
		System.out.println("1.텐동 ,2.라멘, 3.서브웨이");
		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		System.out.println("수량을 입력하세요!");
		num = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println(13000 * num);
			System.out.println("이랏샤이마셰!");
			break;
		case 2:
			System.out.println(9000 * num);
			System.out.println("이랏샤이마셰!");
			break;
		case 3:
			System.out.println(5000 * num);
			System.out.println("이랏샤이마셰!");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			break;
		}

	}
}
