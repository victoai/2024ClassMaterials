package funInterface;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Pra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Runnable bucket = () -> { System.out.println("버킷리스트만들기"
				+  " 버킷리스트지우기"+"\n"); };
		bucket.run();
		
		
		
		Consumer<Integer> shop = money ->
		
		{ 
		 System.out.println("예산 삼만원"); 
		 System.out.println("-만오천원 한우채끝");
		 money -= 15000;
		 
		 System.out.println("-천원 짜파게티");		 
		 money -= 1000;
		 System.out.println("-천원 너구리");
		 money -= 1000;
		 System.out.println("잔액 : "+money);
		 }; 
	   
		shop.accept(30000);
		
		
	   Supplier<String> cook = () -> { return "\n 1.물 끓이기 "
	   		+ " 채끝살 적당히 굽기, 원하는모양으로 자르기\n"
	   		+ " 2. 너구리,짜파게티 끓는 물에 넣기\n "
	   		+ "3. 3분후 스프 2/3씩 섞어놓기\n"
	   		+ " 4. 물 50ml 남기고 버린후 스프랑 잘 비비고 채끝살 넣기\n" ;  }; 	
		
	  String result  = cook.get();		
	
	  
	  System.out.println("레시피"+" : "+ result);
		
	  //Predicate<String> who = TF -> TF.equals();
	  //S
	  
		
		
	}
}
