package 문법.day4;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			int menu = sc.nextInt();
			switch (menu) {
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

			case 0:
				System.out.println("종료");
				break loop;
			}
		}
	}
}
