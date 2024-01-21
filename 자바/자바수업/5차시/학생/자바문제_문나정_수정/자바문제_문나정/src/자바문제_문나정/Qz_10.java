package 자바문제_문나정;

import java.util.Scanner;
public class Qz_10 {

	public static void main(String[] args) {

		int americano = 3000;
		int latte = 4000;
		int icetea = 2000;
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String menu;
		int sel;
		loop: while(true) {
			System.out.println("메뉴를 입력하세요. ex)아메리카노, 라떼, 아이스티 .. 종료라고 입력하면 종료");
			menu = sc.next();
			switch(menu) {
			case "아메리카노":
				System.out.println("수량을 입력하세요. ");
				sel = sc.nextInt();
				sum = sum + (sel * americano);
				break;
			case "라떼":
				System.out.println("수량을 입력하세요. ");
				sel = sc.nextInt();
				sum = sum + (sel * latte);
				break;
			case "아이스티":
				System.out.println("수량을 입력하세요. ");
				sel = sc.nextInt();
				sum = sum + (sel * icetea);
				break;
			case "종료":
				break loop;
			default:
				System.out.println("잘못 입력했습니다. ");
				break;
			}
			
		}
		System.out.println("주문금액: "+ sum);
		
	}

}
