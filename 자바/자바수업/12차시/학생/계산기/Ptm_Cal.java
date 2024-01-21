package day12.인터페이스;

public class Ptm_Cal implements CalculatorI {

	@Override
	public int add(int su1, int su2) {
		System.out.println("addddd");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		System.out.println("subbbb");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		System.out.println("multiii");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		System.out.println("dividee");
		return su1/su2;
	}

}
