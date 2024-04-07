package 실습;

import java.util.Scanner;
import java.util.function.Supplier;

public class 실습_Supplier {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		Supplier<String> s = () -> {
			int a;
			int b;
			
			System.out.println("요리를 시작하겠습니다");
			System.out.println("무슨 요리를 하시겠습니까?");
			System.out.println("1.라면 2.밥");
			a = sc.nextInt();
			switch (a) {
			case 1 :
				loop : while(true){
				System.out.println("무엇을 하시겠습니까?");
				System.out.println("1.물 2.스프 3.면 4.먹는다 5.종료");
				b = sc.nextInt();
				switch (b){
				case 1 :
					System.out.println("물을 올립니다");
					break;
				case 2 :
					System.out.println("스프를 넣습니다");
					break;
				case 3 : 
					System.out.println("면을 넣습니다");
					break;
				case 4 :
					System.out.println("맛있게 먹습니다");
					break;
				case 5 :
					System.out.println("잘먹었습니다");
					break loop;
				}
				}
				return "라면";
				
			case 2 : 
				loop : while(true){
					System.out.println("무엇을 하시겠습니까?");
					System.out.println("1.쌀담기 2.쌀씻기 3.밥 올리기 4.먹는다 5.종료");
					b = sc.nextInt();
					switch (b){
					case 1 :
						System.out.println("쌀을 담습니다");
						break;
					case 2 :
						System.out.println("쌀을 씻습니다");
						break;
					case 3 : 
						System.out.println("밥을 올립니다");
						break;
					case 4 :
						System.out.println("맛있게 먹습니다");
						break;
					case 5 :
						System.out.println("잘먹었습니다");
						break loop;
					}
					}
					return "밥";
					

			default:
				System.out.println("없다 그런거");
				break;
			}
			
			return "망함";
		};
		
		String result = s.get();
		System.out.println(result);
		

	}

}
