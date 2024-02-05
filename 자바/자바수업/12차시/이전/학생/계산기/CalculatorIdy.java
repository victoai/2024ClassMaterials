package day12인터페이스;

//추상매서드만을 가지고 있다. 
//설계도로만 사용할 때 사용한다.
//abstract키워드 생략가능 함 
public class CalculatorIdy implements CalculatorI{	
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("adddy");
		return su1+su2;
	}
	@Override
	public int sub(int su1, int su2) {
		System.out.println("subdy");
		return su1-su2;
	}
	@Override
	public int multi(int su1, int su2) {
		System.out.println("multidy");
		return su1*su2;
	}
	@Override
	public int divide(int su1, int su2) {
		System.out.println("dividedy");
		return su1/su2;
	}
}
