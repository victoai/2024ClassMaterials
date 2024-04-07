package java2prj2.실습;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 실습_준태 {
public static void main(String[] args) {
	
	System.out.println(1);
	
	
	Runnable r = ()-> System.out.println("내꿈은 건물주");
	r.run();
	
	System.out.println(2);
	Consumer<Integer> c = budget -> {
		int 굴소스 = 3500;
		int 차돌박이1kg = 15000;
		int 즉석밥12개입 = 10000;
		System.out.println("굴소스,차돌박이1kg,즉석밥12개입");
		System.out.println("총액="+(굴소스+차돌박이1kg+즉석밥12개입));
		System.out.println("잔액="+(budget-(굴소스+차돌박이1kg+즉석밥12개입)));
		
	};
	c.accept(30000);
	
	System.out.println(3);
	Supplier<String> s = () ->{
		System.out.println("1.파를 송송 썬다.");
		System.out.println("2.즉석밥을 양껏 돌린다.");
		System.out.println("3.파와 대페를 같이 달궈진 팬에 넣는다.");
		System.out.println("4.다익었으면 즉석밥과 굴소스를 넣고 쓰까 먹는다.");
		System.out.println("===오늘의 요리===");
		return "그냥집밥";
		
	};
	String result =s.get();
	System.out.println(result);
	
	System.out.println(4);
	Predicate<String> p = food -> {
		if(food=="그냥집밥") {
		return true;	
		}else {
			return false;
		}
	};
	System.out.println(p.test(result));
	
	System.out.println(5);
	//달러입력시 원화로 가격 알려주기
	Function<Integer,Integer> f = Dollar -> Dollar*1353;
	System.out.println(f.apply(22)+"원");
}
}
