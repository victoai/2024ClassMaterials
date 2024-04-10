package java2prj1.day3.lamda;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class 덧셈 {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("포카리의가격은=>" + a + "게토레이의가격은=>" + b);
		add.accept(2200, 1300);

//		
		BiFunction<Integer, Integer, String> func = (x, y) -> Integer.toString(x * y);
		String result = func.apply(20, 5);
		System.out.println(result); // 100

//		
		BiPredicate<String, Integer> check = (a, b) -> {
			return a.length() == b;
		};

		boolean result2 = check.test("불닭볶음면", 5);
		System.out.println(result2); // true;

		boolean result3 = check.test("신라면", 5);
		System.out.println(result3); // false;
		BiConsumer<Integer, String> biConsumer = (num, text) -> {
			System.out.println("숫자: " + num);
			System.out.println("문자: " + text);
		};

		biConsumer.accept(1, "헬로우월드!");

		Scanner sc = new Scanner(System.in);

		BiFunction<Integer, Integer, Integer> add1 = (su1, su2) -> {
			return su1 + su2;
		};

		System.out.println("사칙연산하고 싶은 첫번째 숫자 입력해");
		int num1 = sc.nextInt();

		System.out.print("사칙연산하고 싶은 두번째 숫자 입력해 ");
		int num2 = sc.nextInt();

		int additionResult2 = add1.apply(num1, num2);
		System.out.println("덧셈 결과 : " + additionResult2);

		BiFunction<Integer, Integer, Integer> sub = (num12, num23) -> num1 - num2;

		int subtractionResult = sub.apply(99, 22);
		System.out.println("뺄셈 결과 : " + subtractionResult);

		BiFunction<Integer, Integer, Integer> mul = (num12, num23) -> num1 * num2;

		int multiplicationResult = mul.apply(11, 11);
		System.out.println("곱셈 결과 : " + multiplicationResult);

		BiFunction<Integer, Integer, Integer> div = (num12, num23) -> {
			if (num1 != 0) {
				return num1 / num2;
			} else {
				System.out.println("제대로 넣어요");
				return 0;
			}
		};

		int divisionResult = div.apply(50, 2);
		System.out.println("나눗셈 결과 : " + divisionResult);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("비교하고 싶은 첫번째 숫자 입력해");
		int num14 = sc.nextInt();

		System.out.print("비교하고 싶은 두번째 숫자 입력해 ");
		int num24 = sc.nextInt();
		BiPredicate<Integer, Integer> isGreaterThan = (su1, su2) -> num1 > num2;

		if (isGreaterThan.test(num1, num2)) {
			System.out.println(num1 + "이(가)" + num2 + "보다 크다");
		} else {
			System.out.println(num1 + "이(가)" + num2 + "보다 작다");
		}
	}

}
