package 실습;

import java.util.Scanner;
import java.util.function.Consumer;

public class 실습_Consumer {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Consumer<Integer> c = (money) -> {
		
		System.out.println("장보기를 시작합니다");
		System.out.println("잔고는" + money +"원입니다");
		System.out.println("물 = 2000원");
		System.out.println("라면 = 5000원");
		System.out.println("쌀 = 10000원");
		System.out.println("과자 = 3000원");
		System.out.println("================");
		int a;
		
		loop : while(true){
			
		if (money <= 0 ){ 
			System.out.println("돈없다!!");
			System.out.println("장보기 종료");
			break;
			}
		
		System.out.println("1.물  2.라면 3.쌀 4.과자 5.종료");
		a = sc.nextInt();
		
		switch (a) {
		case 1 : 
			System.out.println("물을 구입합니다");
			money = money - 2000;
			System.out.println("잔고는" + money +"원입니다");
			break;
			
		case 2 : 
			System.out.println("라면을 구입합니다");
			money = money - 5000;
			System.out.println("잔고는" + money +"원입니다");
			break;
			
		case 3 :
			System.out.println("쌀을 구입합니다");
			money = money - 10000;
			System.out.println("잔고는" + money +"원입니다");
			break;
			
		case 4 :
			System.out.println("과자를 구입합니다");
			money = money - 3000;
			System.out.println("잔고는" + money +"원입니다");
			break;
			
		case 5 :
			System.out.println("장보기 종료");
			System.out.println("남은 금액은" + money +"원입니다");
			break loop;

		default: 
			System.out.println("그런건 없다");
			break;
		}
		}
		};
		
		System.out.println("장볼 금액을 입력하세요");
		c.accept(sc.nextInt());
		
	

	}

}
