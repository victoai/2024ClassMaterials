package day12.인터페이스;


// 인터페이스 상속
// 인터페이스 (약속)을 구현한다는 의미를 가짐
// implements 키워드 사용함
public class MyCalculator_LY implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("윤 add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("윤 sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("윤 multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("윤 divide");
		return su1/su2;
	}
	
}
