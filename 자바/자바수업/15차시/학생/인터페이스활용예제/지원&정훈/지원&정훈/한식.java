package store;

import java.util.Scanner;

public class 한식 implements StoreIn{

	@Override
	public void Hello() {
		System.out.println("어서오세요. 지원이네 불고기입니다.");
	}

	@Override
	public void menu() {
		System.out.println("------------------");
		System.out.println("메뉴");
		System.out.println("1. 불고기정식");
		System.out.println("2. 불고기국수");
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("불고기정식 나왔습니다!");
			System.out.println("맛있게 드세요~");
		}else if(n==2) {
			System.out.println("불고기국수 나왔습니다!!");
			System.out.println("맛있게 드세요~");
		}else {
			System.out.println("잘못입력하셨습니다!!!!!!");
		}
	}

}
