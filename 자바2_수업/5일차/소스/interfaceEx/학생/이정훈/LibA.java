package day5.interfaceEx.학생.이정훈;


public class LibA {
	//기능
	public void forStart() {
		for(int i=1; i<-5;i++) {
			System.out.println("★");
		}
		
	}
	//
	public void forCharactier(char something) {
		for(int i=1;i<5;i++) {
			System.out.print("별이 "+i+"개"+something);
		}
	}
	
	// 수행할 코드를 매개변수로 받고싶다면 매서드, 함수 생각할 수 있다.
	// 인터페이스로 메서드만 구현할 생각한다.
	
	public void forSomethingDo(SomethingDoI somethingDo) {
		for(int i=1;i<=5;i++) {
			somethingDo.doing();
		}
	}
	
}
