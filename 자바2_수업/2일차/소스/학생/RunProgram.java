package day2.lamda.학생;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunProgram {
public static void main(String[] args) {
		
		Runnable r= () ->{
			Scanner sc= new Scanner(System.in);
			int woods=10;
			
			Consumer<String> intro = (x) ->{
				System.out.println(x+"님 환영합니다");
			};
			
			Supplier<Integer> log = () ->{
				int ran= (int)(Math.random()*10);
				System.out.println("벌목을해서 목재를"+ran+"만큼 얻었습니다.");
				return ran;
			};
			Predicate<String> p = ( s)->{
				System.out.println(s+"를 진행하시겠습니까? (y,n)");
				String answer= sc.nextLine();
				if(answer.equals("y")){
					return true;
				} else{
					return false;
				}
			};
			Function<Integer, Integer> f= (x)->{
				System.out.println("나무를 이용해서 불을 피웁니다.(목재 5 소비)");
				return x-5;
			};
			System.out.println("이름을 입력해주세요.");
			intro.accept(sc.nextLine());
			while(woods>0){
				if(p.test("벌목")){
					woods += log.get();
				}
				if(p.test("불피우기")){
					woods = f.apply(woods);
					if(woods<0){
						System.out.println("목재가 부족해서 불을 유지할 수 없었습니다.");
					}
				}
				if(woods>0){
					System.out.println("현재 목재의 재고: "+woods);
				}else{
					System.out.println("목재를 모두 소비했습니다. GAME OVER");
				} 
				
			} 
			
		};
		
		r.run(); 
		
		
	}
	
}
