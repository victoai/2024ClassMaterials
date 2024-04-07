package java2prj1.lamda.practice;

import java.util.Scanner;
import java.util.function.Function;

public class Function_input_return {

	public static void main(String[] args) {
	 
//		1. 제곱구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("제곱할 수를 입력하시오");
		int su =  Integer.parseInt(sc.nextLine());
		
		Function<Integer,Integer> ddouble = x -> x*x;
		Integer result = ddouble.apply(su);
		System.out.println(su+"의 제곱은:"+result);
		
//		2. 입력받은 수 사이의 난수반환
		Scanner sc2 = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		int first = Integer.parseInt(sc2.nextLine());
		
		System.out.println("두번째 수를 입력하시오");
		int second = Integer.parseInt(sc2.nextLine());
		
		Function<Integer,Integer> randomnum = susu -> {
			int random=(int)(Math.random()*(second-first+1))+first;
			return random;
		};
		
		int result2 = randomnum.apply(null);
		System.out.println(result2);
		
//		3. 입력받은 금액의 화폐구하기
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("금액을 입력하시오");
		int money = sc3.nextInt();
		
		Function<Integer,Void> currency = m->{
			int[] don = {50000,10000,5000,1000,500,100,50,10};
			for(int i=0; i<don.length;i++) {
				 int count = m / don[i];
				 m %= don[i];
				 System.out.println(don[i]+"원"+count+"개");
			}
			return null;
			
		}; 
		 currency.apply(money);
		
	}
	
	
}
