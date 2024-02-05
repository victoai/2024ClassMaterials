package day12.인터페이스;

//인터페이스 상속
// 인터페이스 (약속)을 구현한다는 의미를 가짐
// implements 키워들 사용함

public class JuntaeCalculator implements CalculatorI {

	@Override
	public int add(int su1, int su2) {
		System.out.println("준태add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("준태sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("준태multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("준태 divide");
		return su1/su2;
	}

	

}
