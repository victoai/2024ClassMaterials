package 김민규_김민지_실습;

import java.util.Scanner;

public class CatCafe2 extends Cafe{

	@Override
	public void pet() {
		System.out.println("고양이카페 오픈");
		System.out.println("고양이를 선택해주세요 1. 스코티쉬폴드 , 2. 먼치킨 , 3. 터키쉬앙고라 , 4.노르웨이숲 ");
		Scanner sc = new Scanner(System.in);
		int cat = sc.nextInt();
	
		
		switch (cat) {
		case 1:
			System.out.println("스코티쉬폴드");
			break;

		case 2:
			System.out.println("먼치킨");
			break;

		case 3:
			System.out.println("터키쉬앙고라");
			break;
		case 4:
			System.out.println("노르웨이숲");
			break;
		default:
				System.out.println("나가기");
		}

	}
	
	
}
