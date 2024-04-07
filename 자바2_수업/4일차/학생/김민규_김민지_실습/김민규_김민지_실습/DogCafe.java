package 김민규_김민지_실습;

import java.util.Scanner;

public class DogCafe extends Cafe{

	@Override
	public void pet() {
		System.out.println("강아지카페 오픈");
		System.out.println("강아지를 선택해주세요 1. 웰시코기 , 2. 시츄 , 3. 말라뮤트 , 4.말티즈 ");
		Scanner sc = new Scanner(System.in);
		int dog = sc.nextInt();
	
		
		switch (dog) {
		case 1:
			System.out.println("웰시코기");
			break;

		case 2:
			System.out.println("시츄");
			break;

		case 3:
			System.out.println("말라뮤트");
			break;
		case 4:
			System.out.println("말티즈");
			break;
		default:
				System.out.println("나가기");
		}

	}
	
	
}
