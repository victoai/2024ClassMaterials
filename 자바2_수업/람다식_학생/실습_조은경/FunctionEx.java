package java2prj1.day0926.lamda.실습;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num1 = sc.nextInt();
		Function<Integer, Integer> f1 = a -> a*a;
		int result1 = f1.apply(num1);
		System.out.println(result1);
		
		System.out.print("수 입력 : ");
		int num2 = sc.nextInt();
		Function<Integer, Integer> f2 = a -> (int)(Math.random()*a);
		int result2 = f2.apply(num2);
		System.out.println(result2);
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		int[] den = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<den.length; i++) {
			if(money/den[i] > 0) {
				result.add(money/den[i]);
				money = money%den[i];
			}else {
				result.add(0);
			}
		}
		for(int i=0; i<result.size(); i++) {
			System.out.println(den[i] + " : " + result.get(i));
		}
		
	}
}
