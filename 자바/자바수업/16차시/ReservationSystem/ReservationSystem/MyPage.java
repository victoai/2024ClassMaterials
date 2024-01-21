package ReservationSystem;

import java.util.Scanner;

public class MyPage {

	public void menuSelect() {

		loop: while (true) {
			System.out.println("--마이페이지--");
			System.out.println("1. 예약정보확인");
			System.out.println("2. 내정보수정");
			System.out.println("3. 뒤로가기");

			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("--예약정보확인--");
				break;
			case 2:
				System.out.println("--내정보수정--");
				break;
			case 3:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

}
