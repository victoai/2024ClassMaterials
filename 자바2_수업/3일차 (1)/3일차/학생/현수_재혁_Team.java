package day3.lamda;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class 현수_재혁_Team {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("bc1~bc2의 구구단을 출력할 수 있습니다.");
		System.out.println("bc1과 bc2를 순서대로 입력해 주세요");
				
		
		int bc1= sc.nextInt();
		int bc2= sc.nextInt();
		BiConsumer<Integer, Integer> c = (mul1, mul2) -> {

			for (int i = mul1; i <= mul2; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i * j);
				}
				System.out.println();
			}

		};
		c.accept(bc1, bc2);
		System.out.println("곱할 두 수를 입력해 주세요");

		int bf1= sc.nextInt();
		int bf2= sc.nextInt();
		

		BiFunction<Integer, Integer, Integer> f = (plus1, plus2) -> {
			int sum = plus1 * plus2;
			System.out.println(sum);
			return sum;

		};
		f.apply(bf1, bf2);
		
		System.out.println("두 글자를 입력해 주세요");
		String bp1= sc.next();
		String bp2= sc.next();

		BiPredicate<String, String> p = (name1, name2) -> {
			if (name1.equals(name2)) {
				return true;
			} else {
				return false;
			}
			
			

		};
		boolean result =p.test(bp1, bp2);
		System.out.println(result);
		
//		boolean result =p.test("A", "B");
//		boolean result2 = p.test("Hi", "Hi");
//		System.out.println(result);
//		System.out.println(result2);

	}

}
