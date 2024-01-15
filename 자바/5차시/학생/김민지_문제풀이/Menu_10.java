package day5;

import java.util.Scanner;

public class Menu_10 {

	public static void main(String[] args) {
		
		///////////// 무조건 없는메뉴라고 뜹니다 ///////////////////
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("메뉴를 입력하세요, 떡볶이:4000원, 김밥:3000원, 순대:5000원");		
		String menu = sc.next();
		
		System.out.println("수량을 입력하세요");
		int num = sc.nextInt();
		
		int price;
		
		if(menu.equals("떡볶이")) {
			price=4000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else if(menu.equals("김밥")) {
			price=3000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else if(menu.equals("순대")) {
			price=5000*num;
			System.out.println("가격은 "+ price+"원 입니다");
		}else {
			System.out.println("없는 메뉴입니다");
		}
		

	}

}
