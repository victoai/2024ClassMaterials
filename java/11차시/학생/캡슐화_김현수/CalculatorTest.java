package 실습10차시;

import java.util.Scanner;

import com.acorn.hs.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = Calculator.add(num1, num2);
		System.out.println(result);
		result = Calculator.sub(num1, num2);
		System.out.println(result);
		result = Calculator.mul(num1, num2);
		System.out.println(result);
		result = Calculator.div(num1, num2);
		System.out.println(result);
	}
}
