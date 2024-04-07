package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.Runnable: 버킷리스트
		System.out.println("1.Runnable");
		System.out.println();
		
		Runnable runnable = () -> System.out.println("버킷리스트\n1.취업\n2.미국 여행");
		runnable.run();
		
		System.out.println("====================================================");
		System.out.println();
		System.out.println("2.Consumer로 '3만원으로 장보기' ");
		System.out.println("요리: 파스타");
		System.out.println();
		
		
		//2.Consumer: 3만원으로 장보기
		
		Food[] food = new Food[6];
		food[0] = new Food("스파게티면(2000원)");
		food[1] = new Food("토마토 3개(2400원)");
		food[2] = new Food("마늘 1뿌리(500원)");
		food[3] = new Food("올리브오일(3000원)");
		food[4] = new Food("체다치즈 50g(2000원)");
		food[5] = new Food("파슬리(1000원)");
		
		Consumer<Food[]> a = b -> {
			System.out.println("3만원으로 장보기 리스트");
			
			for(int i=0; i<food.length; i++) {
				System.out.println(i+1 + "." + b[i].getMaterial());
			}
		    	
		};
			
			a.accept(food);
			
			
			
			
			//3.Supplier로 '요리 만들기'
			
			System.out.println("======================================================");
			System.out.println();
			System.out.println("3.Supplier로 '요리 만들기' ");
			System.out.println();
			
			
			
			Supplier<String> supplier = () -> "1.끓는 물에 소금을 넣고 스파게티면을 넣어서 8~10분 정도 삶아주세요.\n"
					+ "2.마늘은 다져서 올리브오일에 볶아 향을 내고, 다진 토마토를 넣어줍니다.\n"
					+ "3.삶은 스파게티면을 체에 밭쳐 물기를 뺀 후 2에 넣어줍니다.\n"
					+ "4.체다치즈와 파슬리를 넣고 적당히 버무려서 완성합니다.";
					
					System.out.println(supplier.get());
					
					
					
		    //4. 4.Predicate로 '입력으로 받은 요리가 내가 만든 요리인 경우 true, false 반환하기'
					
		    System.out.println("===================================================");
			System.out.println();
			System.out.println("4.Predicate로 '입력으로 받은 요리가 내가 만든 요리인 경우 true, false 반환하기' ");
			System.out.println();
			
			System.out.print("완성한 요리: ");
			Predicate<String> predicate1 = menu -> {
				String myMenu = "파스타";
				return menu.equals(myMenu);
			};
			
			String myMenu2 = sc.next(); 
			boolean check1 = predicate1.test(myMenu2);
			
			
			
			Predicate<String> predicate2 = recipe -> {
				
				return recipe.equals(supplier.get());
			};
			
			System.out.println("내가 만든 요리");
			System.out.println("1.끓는 물에 소금을 넣고 스파게티면을 넣어서 8~10분 정도 삶아주세요.\n"
					+ "2.마늘은 다져서 올리브오일에 볶아 향을 내고, 다진 토마토를 넣어줍니다.\n"
					+ "3.삶은 스파게티면을 체에 밭쳐 물기를 뺀 후 2에 넣어줍니다.\n"
					+ "4.체다치즈와 파슬리를 넣고 적당히 버무려서 완성합니다.");
			
			String cook = "1.끓는 물에 소금을 넣고 스파게티면을 넣어서 8~10분 정도 삶아주세요.\n"
					+ "2.마늘은 다져서 올리브오일에 볶아 향을 내고, 다진 토마토를 넣어줍니다.\n"
					+ "3.삶은 스파게티면을 체에 밭쳐 물기를 뺀 후 2에 넣어줍니다.\n"
					+ "4.체다치즈와 파슬리를 넣고 적당히 버무려서 완성합니다.";
			boolean check2 = predicate2.test(cook);
			System.out.println("요리 결과: " + check2 + "(요리 성공)");
			
			
			
			//5.Function - 입력으로 들어오는 수의 제곱근 반환하기
			
			
			System.out.println("====================================================");
			System.out.println();
			System.out.println("5.Function - 입력으로 들어오는 수의 제곱근 반환하기");
			System.out.println();
			
			Function<Integer, Integer> function = x -> x*x;
			
			System.out.print("숫자를 입력해주세요: ");
			
			
			int result = function.apply(sc.nextInt());
			System.out.println("결과: " + result);	
			
	}
}