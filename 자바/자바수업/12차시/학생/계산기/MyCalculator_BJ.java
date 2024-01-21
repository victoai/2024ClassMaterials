package day12.인터페이스;

//인터페이스 상속
//인터페이스(약속)을 구현한다는 의미를 가짐
//implements 키워드를 사용함
public class MyCalculator_BJ implements CalculatorI {
	@Override
	public int add(int su1, int su2) {
		System.out.println("BJ ADD RUN");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("BJ SUB RUN");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("BJ MULTI RUN");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("BJ DIVIDE RUN");
		return su1/su2;
	}
	
}
