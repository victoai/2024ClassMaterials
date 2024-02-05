package day12.인터페이스;

// 인터페이스 상속
// 인터페이스 (약속)을 구현한다는 의미를 가짐
// implements

public class MyCalculator_KJY implements CalculatorI {

	@Override
	public int add(int num1, int num2) {
		System.out.println(" Add ");
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		System.out.println(" Sub ");
		return num1 - num2;
	}

	@Override
	public int multi(int num1, int num2) {
		System.out.println(" Multi ");
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		System.out.println(" Divide ");
		return num1 / num2;
	}

}
