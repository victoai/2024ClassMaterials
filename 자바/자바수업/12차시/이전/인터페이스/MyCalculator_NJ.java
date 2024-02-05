package day12.인터페이스;


// 인터페이스도 상속
// 인터페이스 (약속)을 구현한다는 의미를 가짐
// implements 키워드 사용함
public class MyCalculator_NJ implements CalculatorI {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("NJ add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("NJ sub");
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("NJ multi");
		return su1*su2;
	}

	@Override
	public int divide(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("NJ div");
		return su1/su2;
	}

	
	

}
