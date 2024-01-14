package day12.인터페이스;

public class KmjCalculator implements CalculatorI {

	@Override
	public int add(int su1, int su2) {
		System.out.println("민지 add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("민지 sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("민지 multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("민지 divide");
		return su1/su2;
	}

}
