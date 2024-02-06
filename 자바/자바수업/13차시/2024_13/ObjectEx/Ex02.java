package day13.ObjectEx;

public class Ex02 {

	public static void main(String[] args) {
		 
		B b1 = new B(5);
		B b2 = new B(5);
		
		// 두 개의 객체가 만들어 진것 !!		
		// true, false  => 생각하기
		
		//민규님 출력x
		//나정님 출력O
		//재혁  출력x 잘모르
		if( b1.equals(b2)) {// b1 ,b2
			System.out.println(" 두 객체는 같습니다");
		}
		
		//Object의 equals()는 객체의 래퍼런스를 비교합니다. 
		
	}

}
