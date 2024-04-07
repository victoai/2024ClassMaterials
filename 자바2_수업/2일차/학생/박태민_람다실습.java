package java2prj1.lamda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 박태민_람다실습 {

	public static void main(String[] args) {
		// 버킷리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("f1 직관");
		list.add("청하 콘서트");
		list.add("집 장만");

		Runnable r = () -> {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		};
		System.out.println("runnable");
		r.run();

		System.out.println("========================");
		Consumer<Integer> c1 = change -> {

			
		// 3만원 장보기

		int cabbage = 4000;
		int onion = 1000;
		int carrot = 2000;
		int potato = 1300;
		int total = cabbage + onion + carrot + potato;

		if ((change - total) < 0) {
				System.out.println("잔액부족! 돈을 더 챙기세요");
			} else {
				System.out.println("잔돈은 " + (change - total) + "원 입니다");
			}
		};

		System.out.println("consumer");
		c1.accept(30000);
		System.out.println("========================");

		
		// 요리만들기
		Supplier<String> s1 = () -> {
			System.out.println("1. 감자를 채 썰고 물에 15분 정도 담궈 전분기를 뺀다" + "\n2. 당근을 채썬다" + "\n3. 양파를 채썬다" + "\n4. 양배추를 채썬다"
					+ "\n5. 팬에 기름을 두르고 감자채를 볶는다" + "\n6. 채썬 당근을 추가한다" + "\n7. 당근이나 감자가 잘 끊어지면 양파를 넣는다" + "\n8. 소금간을 해준다"
					+ "\n9. 후추를 훛훛 뿌린다" + "\n10. 양파의 숨이 죽을 때까지 볶아주면 완성");
			return "야채볶음";
		};

		System.out.println("supplier");
		String menu = s1.get();
		System.out.println(menu);
		System.out.println("========================");

		
		// 입력으로 받은 요리가 내가만든요리인 경우 true, 아니면 false반환하기
		Scanner sc = new Scanner(System.in);
		System.out.println("predicate");

		System.out.println("당신이 만든 요리를 입력하세요>");
		String real = sc.nextLine();
		
		Predicate<String> s2 = doyou -> real.equalsIgnoreCase(menu);
		boolean result1 = s2.test(real);
		System.out.println(result1);
		
		System.out.println("========================");


		// 입력과 반환있는 함수 만들기
		System.out.println("function");
		// 제곱구하기
		System.out.println("제곱을 구할 수를 입력하세요>");
		int base = sc.nextInt();
		
		Function<Integer, Integer> f1 = new Function<>() {

			@Override
			public Integer apply(Integer base) {
				return base*base;
			}
		};
		int power = f1.apply(base);
		System.out.println(base + "의 제곱은 " + power);
		
		// 입력한 수 내에서의 난수 반환
		System.out.println("1부터 입력한 수 사이의 아무 값이나 나옵니다>");
		int max = sc.nextInt();
		
		Function<Integer, Integer> f2 = new Function<>() {
			@Override
			public Integer apply(Integer max) {
				int range = (int)(Math.random()*max+1);
				return range;
			}
		};
		int result2 = f2.apply(max);
		System.out.println(result2);
		
		
		System.out.println("얼마 가지고 있어??>");
		int having = sc.nextInt();
		
		Function<Integer, String> f3 = new Function<>() {
			
			@Override
			public String apply(Integer having) {

				int[] change = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
				
				for(int unit : change) {
					int count = having / unit;
					if (count > 0){
						System.out.println(unit + "원 짜리 " + count + "개");
						having %= unit;
					}
				}
				return "남은 금액 "+having + "원";
			}
		};
		String result4 = f3.apply(having);
		System.out.println(result4);
	}

}
