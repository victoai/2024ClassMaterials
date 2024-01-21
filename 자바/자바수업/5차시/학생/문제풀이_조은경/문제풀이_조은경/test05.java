package day4;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {

		

		System.out.print("\n--------------5번--------------\n");

		Scanner sc5 = new Scanner(System.in);
		loop: while (true) {
			int menu5 = sc5.nextInt();

			switch (menu5) {
			case 1:
				System.out.println("등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println("변경");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
		
		
		

		
	}

}
