package day12.인터페이스;
//인터페이스도 상속이다
//인터페이스(약속)을 구현한다는 의미를 가진다.
//implements 키워드 사용함
public class MyCalculator_YJ implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		System.out.println("예진add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("예진sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("예진multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("예진divide");
		return su1/su2;
	}

}
