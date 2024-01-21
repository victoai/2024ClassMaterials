package day5;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
/*
 10.  주문수량, 메뉴를 입력받아 해당 주문의 주문금액을 출력하는 프로그램 작성하시오     
      ( 메뉴, 가격 임의로 정하기 )
 */
	System.out.println("원하는 메뉴번호와 수량을 입력하세요");
	System.out.println("1. 제육볶음(7천원) 2. 돈가스(8천원) 3. 새우튀김우동(6천원) 4. 참치김밥(4천원)");
	
	Scanner sc = new Scanner(System.in);
	
	int menu = sc.nextInt();
	int q = sc.nextInt();
	
	switch (menu) {
	case 1:
		System.out.println("제육볶음 "+ q + "개 총 " + 7000*q + "원 입니다");
		break;
	case 2:
		System.out.println("돈가스 "+ q + "개 총 " + 8000*q + "원 입니다");
		break;
	case 3:
		System.out.println("새우튀김우동 "+ q + "개 총 " + 6000*q + "원 입니다");
		break;
	case 4:
		System.out.println("참치김밥 "+ q + "개 총 " + 4000*q + "원 입니다");
		break;
		default:
			System.out.println("메뉴번호는 1부터 4 사이에서 입력하세요");
		break;
	}sc.close();

	}

}
