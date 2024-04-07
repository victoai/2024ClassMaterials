import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PracticeEx {
	public static void main(String[] args) {

		// Runnable
		Runnable r = () -> {
			System.out.println("주말에 할일");
			System.out.println("1.피파하기");
			System.out.println("2.백준 알고리즘 문제 10개 정도 풀기");
			System.out.println("3.친구 자취집 집들이하기");
			System.out.println("4.집에서 푹 쉬기");

		};

		r.run();

//Consumer
		ArrayList<Food> buylist = new ArrayList<>();

// 상품 가격 목록 추가
		buylist.add(new Food("한우 불고기용", 15000));
		buylist.add(new Food("양배추", 3000));
		buylist.add(new Food("깻잎", 1100));
		buylist.add(new Food("청경채", 1600));
		buylist.add(new Food("만가닥버섯", 1600));
		buylist.add(new Food("팽이버섯", 1700));
		buylist.add(new Food("표고버섯", 3000));

		int mymoney = 30000;

		System.out.println();

		Consumer<ArrayList<Food>> consumer =  foodList -> {
			int totalCost = 0;
			for (Food m : foodList) {
				int price = m.getPrice();
				if (totalCost + price <= mymoney) {
					totalCost += price;
					System.out.println(price);
				} else {
					break;
				}
			}
			System.out.println("총 비용: " + totalCost + "원");
		};

		consumer.accept(buylist);
//
		System.out.println();

		Supplier<String> cook = () -> "1.냄비에 육수재료를 끓여 육수를 만들기\n2.배추, 깻잎, 고기, 배추 순으로  쌓기\n3.버섯 넣고 재료 익는걸 기다리기\n4.맛있게 먹기";
		Supplier<String> cook2 = () -> "밀푀유";

		System.out.println(cook.get());

		Predicate<String> menu = eat -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("만든 요리 이름은?");
			String cookmenu = sc.nextLine();

			if (cookmenu.equals(cook2.get())) {

				return true;
			} else {
				return false;
			}

		};

		if (menu.test("밀푀유") == true) {
			System.out.println("밀푀유 완성");
		} else {
			System.out.println("요리실패");
		}
		;

		//
		Scanner sc = new Scanner(System.in);
		Function<Integer, Integer> square = x -> x * x;

		System.out.println(square.apply(5));

		Function<Integer, Integer> p1 = x -> {

			return x;

		};

		Function<Integer, Integer> p2 = x2 -> {
			int[] blil = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

			for (int i = 0; i < blil.length; i++) {
				System.out.println(blil[i] + "원 : " + (x2 / blil[i]));
				x2 %= blil[i]; // 나누고대입
			}

			return x2;
		};

		Random r2 = new Random();
		int a = sc.nextInt();
		int b = r2.nextInt(a);

		System.out.println(p1.apply(b + 1));

		int money = sc.nextInt();

		p2.apply(money);
	}

}
