package java2prj1.day3.lamda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Ex01 {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biconsumer = (su1, su2) -> {

			System.out.println("미네랄은" + su1 + " " + "가스는" + su2);
		};
		biconsumer.accept(1000, 2000);

		BiFunction<Integer, Integer, String> bf = (bf1, bf2) -> {

			if (bf1 >= 4000 && bf2 >= 4000) {
				return "벌쳐";
			} else if (bf1 >= 2000 && bf2 >= 2000) {
				return "배틀쿠르져";

			} else
				return "크리쳐";
		};

		String result = bf.apply(2000, 4000);
		System.out.println(result);

		BiPredicate<String, String> bp = (str1, str2) -> {

			if (str1 == str2)
				return true;
			else
				return false;
		};
		boolean result1 = bp.test("가나다", "다나가");
		System.out.println(result1);
	}
}