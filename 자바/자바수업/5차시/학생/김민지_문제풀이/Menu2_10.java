package day5;

import java.util.Scanner;

public class Menu2_10 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("메뉴의 번호를 입력하세요, 1.떡볶이:4000원, 2.김밥:3000원, 3.순대:5000원");		
		int menu = sc.nextInt();
		
		System.out.println("수량을 입력하세요");
		int num = sc.nextInt();
		
		int price;
		
		if(menu==1) {
			price=4000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else if(menu==2) {
			price=3000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else if(menu==3) {
			price=5000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else {
			System.out.println("없는 메뉴입니다");
		}
		


	}

}
