package day04;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		int menu;
		loop:while (true) {
			
			System.out.println("1.등록, 2.조회, 3.변경, 4.삭제, 5.종료");

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
			case 5:
				System.out.println("종료합니다.");
				break loop;
			default:
				System.out.println("재입력하세요");
				break;
			
			

			}

		}
	}

}
