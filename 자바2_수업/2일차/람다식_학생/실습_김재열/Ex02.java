package java2prj1.lamda;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex02 {
	public static void main(String[] args) {

		System.out.println("금액을 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		int amountV = Integer.parseInt(sc1.nextLine());

		Runnable MyAmmount = () -> {

			System.out.println("당신이 보유한 금액은 : " + amountV + "원 입니다.");
		};

		MyAmmount.run();

		Consumer<Integer> shopping = amount -> {

			Supplier<Integer> TomatoSup = () -> {
				int Tomato = 1000;
				System.out.println("몇개의 토마토를 사시겠습니까?" + " " + "\n토모토의 가격은" + " " + Tomato + "입니다");
				Scanner sc2 = new Scanner(System.in);
				int TomatoEA = Integer.parseInt(sc2.nextLine());
				return TomatoEA;
			};

			Supplier<Integer> PotatoSup = () -> {
				int Potato = 2000;
				System.out.println("몇개의 감자를 사시겠습니까?" + " " + "\n감자의 가격은" + " " + Potato + "입니다");
				Scanner sc3 = new Scanner(System.in);
				int PotatoEA = Integer.parseInt(sc3.nextLine());
				return PotatoEA;
			};
			int TomatoEA = TomatoSup.get();
			int PotatoEA = PotatoSup.get();

			int TomatoPrice = TomatoEA * 1000;
			int PotatoPrice = PotatoEA * 2000;

			int totalCost = TomatoPrice + PotatoPrice;
			int remainingAmount = amount - totalCost;

			System.out.println("토마토 " + TomatoEA + "개와 감자 " + PotatoEA + "개로 알수 없는 뇨끼를 하였습니다.");
			System.out.println("남은 금액은 : " + remainingAmount + "원 입니다.");

		};
		shopping.accept(amountV);

		Predicate<Integer> MyDish = (PotatoEA) -> {

			if (PotatoEA >= 10)
				return true;
			else
				return false;
		};
		
		boolean isMine = MyDish.test(amountV);
		System.out.println("재료의 갯수를 보아하니 내것이 " + isMine);

	}
}
