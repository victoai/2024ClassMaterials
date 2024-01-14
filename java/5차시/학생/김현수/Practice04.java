package day04;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		System.out.println("1.등록, 2.조회, 3.변경, 4.삭제");
		int menu;

		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("등록합니다.");
			break;
		case 2:
			System.out.println("조회합니다.");
			break;
		case 3:
			System.out.println("변경합니다.");
			break;
		case 4:
			System.out.println("삭제합니다.");
			break;
		default:
			System.out.println("오류입니다.");
			break;
		}

		System.out.println("종료합니다.");

	}
}
