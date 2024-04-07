package java2prj1.lamda.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_mycooking {

	public static void main(String[] args) {

		ArrayList<String> dishes = new ArrayList<>();
		dishes.add("봉골레");
		dishes.add("명란오일파스타");
		dishes.add("로제파스타");
		dishes.add("치킨샐러드");
		dishes.add("치킨필라프");

		Scanner scanner = new Scanner(System.in);
		System.out.println("요리의 이름을 입력하세요");
		
//		사용자로부터 요리의 이름을 입력받아서 그 값을 inputDish 변수에 저장
		String inputDish = scanner.nextLine(); 

		Predicate<String> checkdishes = mycooking -> {
			for (String dish : dishes) {
				if (dish.equals(inputDish)) {
					return true;
				}
			}
			return false;

		};

		boolean result = checkdishes.test(inputDish);
		 System.out.println(result);
	}
	

}
