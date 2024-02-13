package 복습및정리.함수_매서드;

public class A인스턴스매서드 {

	
	public   void 인스턴스매서드1() {
		System.out.println(" 객체 생성필요없이 클래스명.매서드 명으로 호출합니다 , 이 기능을 단독으로 제공하겠다.");
	}
	
	
	public static void main(String[] args) {
		
		
		B스태틱매서드.스태틱매서드1();
	}
}
