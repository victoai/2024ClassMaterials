package day12.업다운캐스팅.예진님;

public class LibraryTest {

	public static void main(String[] args) {
	
		자바의정석 J = new 자바의정석();
		부의인문학 M = new 부의인문학();
		
		J.already_B();
		M.already_R();
		
		Library Li = J; // 업캐스팅
//		자바의 정석 already_B 보이지 않음
		
		자바의정석 Ja =(자바의정석)Li; //다운캐스팅
		Ja.already_B();
	}

}
