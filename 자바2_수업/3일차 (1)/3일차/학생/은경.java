package java2prj1.day0927.lamda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Experience {

	public static void main(String[] args) {
		
		// 입력 : 이름 나이
		// 사는 물품, 소지금액    -> 잔액
		// 물품 나이 제한   구매유무
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("소지금액를 입력하세요");
		int won = 1;
		 won = sc.nextInt();
		
		BiConsumer<String, Integer> bc = (a, b)->System.out.println(a+"님 환영합니다!!"+b+"세이군요.");
		
		bc.accept(name, age);
		
		ArrayList<Goods> list = new ArrayList<>();
		list.add(new Goods("새우깡",3200,2));
		list.add(new Goods("먹태깡",3000,2));
		list.add(new Goods("감자깡",3500,2));
		list.add(new Goods("고구마깡",3300,2));
		list.add(new Goods("포스틱",2500,2));
		list.add(new Goods("양파링",2000,2));
		list.add(new Goods("야채타임",1500,2));
		list.add(new Goods("오감자",1700,2));
		list.add(new Goods("켈리",4000,20));
		list.add(new Goods("테라",4000,20));
		list.add(new Goods("아사히",4000,20));
		list.add(new Goods("블랑",4000,20));
		list.add(new Goods("한대피깡",4500,20));
		
		for (int i=0; i<list.size(); i++ ) {
			System.out.println(i+1 +"."+list.get(i));
		}
	
		System.out.println("사고싶은 물품을 입력하세요");
		int in = sc.nextInt();
		//
		BiFunction<Integer, Integer, Integer> bf = (a,b) -> {
			
			int na=list.get(a-1).getPrice();
			
			BiPredicate<Integer, Integer> bp = (c,d)->{
				int naga=list.get(c-1).getAge();
				boolean rst = false;
				if(d > naga) {
					rst = true;
				}else {
					rst = false;
				}
				return rst;
			};
			boolean result = bp.test(in, age );
			
		
			if(result) {
				
				System.out.println("잔액"+(b-= na));
			}else {
				System.out.println("물품을 구매할 수 없습니다");
			}
			return b;
			};
			bf.apply(in, won);
		
		
	
		
		

		
	
	}
}
