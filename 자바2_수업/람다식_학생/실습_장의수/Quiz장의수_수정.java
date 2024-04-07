package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
Runnable
Consumer<T>
Supplier<T>
Predicate<T>
Function<T,R>

1. Runnable  :  버킷리스트 출력하기 

2. Consumer  :   3만원으로 장보기  
3. Supplier  :    요리만들기

4. Predicate  :   입력으로 받은 요리가 내가만든요리인 경우 true, false반환하기

5. Function  :  입력하나 반환있는 함수 만들기

                       - 입력으로 들어오는 수의 제곱근 반환하기
                       - 입력으로 들어오는 수의 범위안의 난수 반환하기
                       - 입력으로 들어오는 금액에 대한 화폐매수 구하기
 
 Integer[]

BiConsumer<T,U>      : 두 개의 매개변수를 받아서 사용
BiFunction<T,U,R>    :  두 개의 매개변수를 받아서  사용하고 리턴함
BiPredicate<T,U>     :  두 개의 매개변수를 받아서  true, false 리턴
*/

public class Quiz장의수_수정 {

	public static void main(String[] args) {
		//1번문제
		System.out.println("1번 문제\n");
		Runnable r= ()->{
			String[] bucket={"게임만들기"
					,"모바일 게임 회사 들어가기"
					,"flutter 배우기",
					"토익 800점이상 받기"};
			Arrays.stream(bucket).forEach(b -> System.out.println(b));
		};
		r.run();
		//2번문제
		System.out.println("\n2번 문제\n");
		Consumer<Integer> c= ( money)->{
			int my_money=(int) money;
			String[] food_name={"파스타면","크림소스","물","랍스타"};
			int[] price={5000,8000,0,50000};
			for(int i=0;i<price.length;i++){
				if(my_money>price[i]){
					System.out.println(food_name[i]+"를 샀습니다.");
					money -= price[i];
				}else{
					System.out.println("잔액이 부족합니다. (구매실패)");
				}
			}
			System.out.println("장보기끝, 남은돈:"+money);
		};
		c.accept(30000);
		//3번문제
		System.out.println("\n3번 문제\n");

		Supplier<String> s= () ->{
			String[] ingreds2= new String[]{"물","파스타면","크림소스"};
			
			for(int i=0;i<ingreds2.length;i++){
				switch(ingreds2[i]){
				case "파스타면":
					System.out.println(ingreds2[i-1]+"에 "+ingreds2[i]+"를 삶습니다.");
					break;
				case "크림소스":
					System.out.println(ingreds2[i-1]+"을 "+ingreds2[i]+"과 비빕니다.");
					break;
				case "물":
					System.out.println(ingreds2[i]+"을 끓입니다.");
					break;
				}
				if(i == ingreds2.length-1){
					System.out.println("짠, 크림파스타 완성!");
					return "크림파스타";
				}
			}
			return "요리에 실패";
		};
		s.get();
		//4번문제
		System.out.println("\n4번 문제\n");
		Predicate<String> p= (food)->{
			if(food.equals("크림파스타")){
				return true;
			}else{
				return false;
			}
			
		};
		String[] foods={"쌀밥","크림파스타","제육덮밥","게살크림파스타"};
		for(String f: foods){
			if(p.test(f)){
				System.out.println(f+"는 제가 만든 음식입니다.");
			}else{
				System.out.println(f+"는 제가 만든 음식이 아닙니다.");
			}
		}
		//5번문제
		System.out.println("\n5번 문제\n");
		
		Function<Integer, Double> f1= (num)->{
			return Math.sqrt(num);
		};
		Function<Integer, Integer> f2= (num)->{
			return (int)(Math.random()*num);
		};
		
		Function<Integer, int[]> f3= (num)->{
			int[] unit= {50000,10000,5000,1000,500,100,50,10};
			int[] quantity = new int[8];
			
			for(int i=0; i<unit.length;i++){
				quantity[i] =num / unit[i];
				num %= unit[i];
			}
			
			return quantity;
		};
		System.out.println("5-1. "+f1.apply(10));
		System.out.println("5-2. "+f2.apply(10));
		System.out.print("5-3. ");
		Arrays.stream(f3.apply(456780)).forEach( m -> System.out.print(m+"매 "));
		
	}

}
