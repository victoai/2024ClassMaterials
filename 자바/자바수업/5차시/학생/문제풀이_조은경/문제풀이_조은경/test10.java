package day4;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {

		System.out.print("\n--------------10번--------------\n");

		Scanner sc10 = new Scanner(System.in);
		System.out.println("메뉴을 입력하세요.");
		String menu = sc10.next();
		System.out.println("수량을 입력하세요.");
		int quantity = sc10.nextInt();
		int price = 0;
		switch (menu) {
			case "김치찌개":
				price = 8000 * quantity;
				break;
			case "된장찌개":
				price = 7000 * quantity;
				break;
			case "부대찌개":
				price = 9000 * quantity;
				break;
			case "순댓국":
				price = 10000 * quantity;
				break;
			case "평양냉면":
				price = 15000 * quantity;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		System.out.println("가격 : " + price);

	}

}
