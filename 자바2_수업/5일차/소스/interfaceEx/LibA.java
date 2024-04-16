package day5.interfaceEx;


interface SomethingDoI {
    public void doing();      
}



public class LibA {

	//기능
	public void forStart() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("★");
		}
	}

	
	//
	public void forCharacter(char something) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(something);
		}
	}
	
	
	// 수행할코드를 매개변수로 받고 싶다면   매서드, 함수 생각할 수 있다.
	// 인터페이스로 구현해야할 매서드만 정한다.	
	public void forSomethingDo(SomethingDoI  somethingDo ) {		
		for( int i=1; i<=5 ; i++) {			 //  
			somethingDo.doing();
		}		
	} 
	  
}
