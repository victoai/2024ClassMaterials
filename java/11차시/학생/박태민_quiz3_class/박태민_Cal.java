package day10.quiz;

import java.util.Scanner;

public class 박태민_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("사칙연산할 두 수를 입력하세요>");

		Scanner scanner = new Scanner(System.in);

		String sc1 = scanner.nextLine();
		int su1 = Integer.parseInt(sc1);
		String sc2 = scanner.nextLine();
		int su2 = Integer.parseInt(sc2);
		
		int plus = 박태민_Cal_class.plus(su1, su2);
		int minus = 박태민_Cal_class.minus(su1, su2);
		int multiple = 박태민_Cal_class.multiple(su1, su2);
		double divide = 박태민_Cal_class.divide(su1, su2);
		
		System.out.printf("%d+%d=%d%n", su1, su2, plus);
		System.out.printf("%d-%d=%d%n", su1, su2, minus);
		System.out.printf("%d*%d=%d%n", su1, su2, multiple);
		System.out.printf("%d/%d=%f%n", su1, su2, divide);
		
	}

}
