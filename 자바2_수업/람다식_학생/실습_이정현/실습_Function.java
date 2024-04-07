package 실습;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class 실습_Function {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("제곱근 할 수를 입력해주세요");
		int a = sc.nextInt();
		
		Function<Integer, Double> f1 = (b) -> {
			return Math.sqrt(b);
		};
		
		Double result1 = f1.apply(a);
		System.out.println(" 제곱근 값은 : "+result1);
		
		
		
		System.out.println("난수 반환할 수를 입력하세요");
		a = sc.nextInt();
		
		Function<Integer, Integer> f2 = (c) -> {
			return (int) (Math.random()*c);
		};
		
		Integer result2 = f2.apply(a);
		System.out.println(" 반환할 난수는 : " + result2);
		
		
		
		System.out.println("얼마인가요?");
		a = sc.nextInt();
		
		Function<Integer, int[]> f3 = (d) -> {
			int[] i = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] i2 = new int[8];
			
			for(int j=0; j<i.length; j++){
				i2[j] = d / i[j];
				d = d % i[j];
			}
			
			return i2;
		};
		
		int[] result3 = f3.apply(a);
		System.out.println(" 화폐 매수는 " + Arrays.toString(result3));

	}

}
