package javaprj.day0205;

public class Dog extends Animal {
	
	public void 집을지킨다() {
		System.out.println( "집을 지킨다");
	}
	
	/* 부모의 매서드 재정의 할 수 있다.=> 오버라이딩 
	 * 부모의 매서드를 재정의 할 때는 반드시 입력, 반환 정보 모두 같아야 한다.*/
	@Override
	public void 짖는다() {
	   System.out.println("멍멍");
		
	}

}
