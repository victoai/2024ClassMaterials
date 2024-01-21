package store;

import java.util.Scanner;

public class 냉우동집 implements StoreIn {

	@Override
	public void Hello() {
		System.out.println("いらっしゃいませ!!(어서오세요!!)");
		
	}

	@Override
	public void menu() {
		System.out.println("------------------");
		System.out.println("메뉴");
		System.out.println("1. 판우동");
		System.out.println("2. 니꾸타마붓가케우동");
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("판우동 나왔습니다!");
			System.out.println("맛있게 드세요~");
		}else if(n==2) {
			System.out.println("가케우동 나왔습니다!!");
			System.out.println("맛있게 드세요~");
		}else {
			System.out.println("잘못입력하셨습니다!!!!!!");
		}
	}



}
