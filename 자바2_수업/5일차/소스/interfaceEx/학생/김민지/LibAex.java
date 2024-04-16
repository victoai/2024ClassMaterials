package day5.interfaceEx.학생.김민지;

public class LibAex {

	public static void main(String[] args) {
		
		LibA libA = new LibA();	  // 라이브러리를 사용할 객체 생성	
		
		libA.forStart();		  //매서드호출
		libA.forCharacter('♡');		// 매서드 호출
		libA.forSomethingDo(libA);  //매서드 호출		
		
		
		
	}

}
