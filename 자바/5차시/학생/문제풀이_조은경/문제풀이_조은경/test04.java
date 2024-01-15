package day4;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {

		

		System.out.print("\n--------------4번--------------\n");

		Scanner sc4 = new Scanner(System.in);
		int menu4 = sc4.nextInt();
		switch (menu4) {
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
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

		
		
	}

}
