package day12.인터페이스;

//인터페이스 상속
//인터페이스(약속)을 구현한다는 의미를 가짐
//implements 키워드를 사용함
public class MyCalculator_ek implements CalculatorI {
	
	public int add( int su1, int su2) {
		return su1 + su2;
	}
	
	public int sub( int su1, int su2) {
		return su1 - su2;
	}
	
	public int multi( int su1, int su2) {
		return su1 * su2;
	}
	
	public int divide( int su1, int su2) {
		return su1 / su2;
	}

}
