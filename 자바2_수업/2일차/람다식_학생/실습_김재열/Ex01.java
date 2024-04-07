package java2prj1.lamda;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex01 {

	public static void main(String[] args) {

		Runnable kjy = () -> {
			System.out.println("바디 프로필 찍기");
			System.out.println("해외 배낭여행 가기");
			System.out.println("낙하산 타보기");
		};
		kjy.run();

		Function<Integer, Integer> f = new Function<>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}
		};

		System.out.println("제곱을 구하고 싶은 수를 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		int num1 = Integer.parseInt(sc1.nextLine());
		int result1 = f.apply(num1);
		System.out.println(result1);

		//

		Function<Integer, Integer> f2 = new Function<>() {

			@Override
			public Integer apply(Integer t) {

				return (int) (Math.random() * t);
			}
		};
		System.out.println("난수를 구하고 싶은 범위값을 입력하세요");
		Scanner sc2 = new Scanner(System.in);
		int num2 = Integer.parseInt(sc2.nextLine());
		int result2 = f2.apply(num2);
		System.out.println(result2);

		Function<Integer, Integer> f3 = new Function<>() {

			@Override
			public Integer apply(Integer t) {
				int[] MoneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
				String[] MoneyUnitK = { "오만 원", "만 원", "오천 원", "천 원", "오백 원", "백 원", "오십 원", "십 원", "일 원" };

				for (int i = 0; i < MoneyUnit.length; i++) {
					int count = t / MoneyUnit[i];
					if (count > 0) {
						System.out.println(MoneyUnitK[i] + ": " + count + "매");
						t %= MoneyUnit[i];
					}
				}

				return null;
			}
		};
		System.out.println("매수를 구하고 싶은 금액을 입력해 주세요");
		Scanner sc3 = new Scanner(System.in);
		int num3 = Integer.parseInt(sc3.nextLine());
		int result3 = f3.apply(num3);
		System.out.println(result3);
	}
}
