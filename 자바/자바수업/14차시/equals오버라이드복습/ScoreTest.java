package day14.equals오버라이드복습;

public class ScoreTest {

	public static void main(String[] args) {
		 
		
		Score s = new Score("홍길동",100,90);
		Score s2 = new Score("홍길동",80,90);

		
		
		if( s.equals(s2)) {
			System.out.println(" 같은학생");
		}
		
		
		
		Object o=s;
		Object o2 = s2;
		
		if( o.equals(o2)) {
			System.out.println(" 같은학생");
		}else {
			System.out.println(" 같은학생 아니다");
		}
		
	}

}
