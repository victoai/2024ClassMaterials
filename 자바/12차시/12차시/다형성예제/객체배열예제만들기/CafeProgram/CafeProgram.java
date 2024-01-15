package prjDay12;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeProgram {

	public static void main(String[] args) {
		
		Cafe h = new Cafe();
		
		ArrayList<Cafe> c = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		String name;
//		String menu;
//		int price;
//		String open;
//		String close;
//		
		
		for(int i=0; i<1;i++) {
			System.out.print("카페이름"); 
			h.name = sc.next();
			System.out.print("메뉴이름");
			h.menu = sc.next();
			System.out.print("가격");
			h.price = sc.nextInt();
			System.out.print("오픈시간");
			h.open = sc.next();
			System.out.print("마감시간");
			h.close = sc.next();
			
			Cafe c2 = new Cafe(h.name,h.menu,h.price,h.open,h.close);
			c.add(c2);
		}
		
		
		// 직접 정보 담기
//		c.add(new Cafe("에이콘카페","아메리카노",3000,"9시","6시"));
	
		
		// 출력
		
		for(int i=0; i < c.size(); i++) {
			System.out.println(c.get(i).toString());
		}
		
//		System.out.println(c.get(0).getInfo());
		
	}
	
}
