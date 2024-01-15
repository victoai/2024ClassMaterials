package day14.equals오버라이드복습;

 

public class ScoreTest3 {

	public static void main(String[] args) {


		
		Score score = new Score("홍길동",100,80);
		Score score2 = new Score("홍길동",90,90);
		
		if( score.equals(score2)) {
			System.out.println(" 같은 학생이다");
			
		}else {
			System.out.println(" 같은 학생이 아니다");
		}
		
		
		///
		Object o = score;  //업캐스팅 
		Object o2 = score2;  //업캐스팅
		
		
		if( o.equals(o2)) {
			System.out.println(" 같은 학생이다");
		}else {
			System.out.println(" 같은 학생이 아니다");
		}
		
		
		
	}

}
