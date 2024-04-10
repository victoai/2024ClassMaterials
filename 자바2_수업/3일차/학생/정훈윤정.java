package java2prj1.day3.lamda;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("====== 메뉴판 ======\n");
		
		BiConsumer<String, Integer> market = (name, price) -> {
			System.out.println("상품 이름: " + name);
			System.out.println("상품 가격: " + price+"\n");
		};
		
		
		market.accept("1. 아폴로", 300);
		market.accept("2. 쫀드기", 500);
		market.accept("3. 차카니", 300);
		
		
		System.out.println("===================");
		
		
		
		
		BiFunction<Integer, Integer, Integer> market2 = (count, amount) -> count * amount; {
						
			System.out.print("구매할 상품 선택: ");
			Scanner sc = new Scanner(System.in);
			int scan = sc.nextInt();
			
			if(scan==1) {
				System.out.println("아폴로 선택");
				System.out.print("아폴로를 몇 개 구매하실 건가요? ");
				int cnt = sc.nextInt();
				int result = market2.apply(cnt, 300);
				System.out.println("선택한 제품 " + cnt+"개 구매시 가격은 " + result);	
			} else if(scan==2) {
				System.out.println("쫀드기 선택");
				System.out.print("쫀드기 몇 개 구매하실 건가요? ");
				int cnt = sc.nextInt();
				int result = market2.apply(cnt, 500);
				System.out.println("선택한 제품 " + cnt+"개 구매시 가격은 " + result);	
			} else if(scan==3) {
				System.out.println("차카니 선택");
				System.out.print("쫀드기 몇 개 구매하실 건가요? ");
				int cnt = sc.nextInt();
				int result = market2.apply(cnt, 500);
				System.out.println("선택한 제품 " + cnt+"개 구매시 가격은 " + result);	
			}
		
		};

	}

}
