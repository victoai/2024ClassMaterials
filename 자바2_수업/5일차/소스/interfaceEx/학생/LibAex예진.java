package day5.interfaceEx.학생;

public class LibAex예진 {

	public static void main(String[] args) {
		
		LibA libA = new LibA();
		
		libA.forStart();
		
		libA.forCharacter('♡');
		
		libA.forSomethingDo(libA);
	}

}

 
 

interface SomethingDoI{
	public void doing();
}

  class LibA implements SomethingDoI {

	public void forStart() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("★");
		}
	}

	public void forCharacter(char something) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(something);
		}
	}

	// 수행할 코드를 매개변수로 받고 싶다면 매서드, 함수 생각할 수 있다.
	// 인터페이스로 구현해야할 매서드만 정한다.
	public void forSomethingDo(SomethingDoI somethingDo) {
		for(int i=1; i<=5; i++) {
			somethingDo.doing();
		}
	}

	@Override
	public void doing() {
		System.out.println("코드반복");
		
	}
	
}

 
