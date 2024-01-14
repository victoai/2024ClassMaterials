package 병진_스마트스토어;

import java.util.Scanner;

public class smartStore {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//로그인
		System.out.print("아이디를 입력하세요(아무거나) : ");
		String userId; //아이디 입력
		userId = sc.next();
		System.out.println("\nㅡ 환영합니다 ㅡ\n");

		Order storeManager = new Order();
		//초기화
		storeManager.Init();
		
		loop:while(true){
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("1.등록, 2.삭제, 3.구매, 0.종료 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: //등록하기
				storeManager.insertItem();
				break;
			case 2: //삭제하기
				storeManager.deleteIndex();
				break;
			case 3: //구매하기
				storeManager.buyItem(userId);	
				break;
			case 0: //종료
				System.out.println("시스템 종료");
				break loop;
			default: //잘못된 입력
				System.out.println("잘못된 입력");
			}
		}
	}
}
