package day12.인터페이스;

// 인터페이스 상속
// 인터페이스 (약속)을 구형한다는 의미를 가짐
// implements 키워드를 사용함
public class MyCalculator_JH implements CalculatorI{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("정훈 add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("정훈 sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("정훈 multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("정훈 divide");
		return su1/su2;
	}

}
