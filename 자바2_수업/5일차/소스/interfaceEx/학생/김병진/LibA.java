package day5.interfaceEx.학생.김병진;


//인터페이스 구현
public class LibA implements SomethingDoI {
	public void forStart() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("★");
		}
		System.out.println();
	}

	public void forCharacter(String c) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(c);
		}
	}
	@Override
	public void bj() {
		System.out.println("🍗🍗🍗");
	}
	
	public void Something(SomethingDoI SomethingDo) {
		for (int i = 1; i <= 5; i++) {
			SomethingDo.bj();
		}
	}

	 

}