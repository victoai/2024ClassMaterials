package week04.day2.objectEx;

public class ScoreTest {

	public static void main(String[] args) {
		 
		//생성자
		Score s = new Score("홍길동", 100 ,90);
		Score s2 = new Score("가길동", 100,90);
		
		//setter , getter 이용해보기
		
		int eng = s.getEng();
		System.out.println( eng);		
		
		s.setKor(50);
		
		//toString 사용하기
		System.out.println( s.toString());
		
		
		// 두 객체를 비교하기 
		//  equals 재정의해서 사용해 보세요
		
		//Score s = new Score("홍길동", 100 ,90);
		//Score s2 = new Score("가길동", 100,90);
		//
		boolean result  =  s.equals(s2);
		System.out.println(  result);
		 
		 
		
		
	}

}
