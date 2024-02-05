package day12.객체배열;

public class ScoreTest {

	public static void main(String[] args) {
		
		
		Score s= new  Score("01", 100,90,50);
		Score s1= new Score("02", 95,100,80);
		Score s2= new Score("03", 85,90,99);
				
	 
		System.out.println( s.toString());  //toString()생략가능함 
		System.out.println( s1);  //toString()생략가능함 
		System.out.println( s2);  //toString()생략가능함 
		
		
		// s , s1,  s2 와 같이 참조형변수를 배열로 만든것 !!
		// 참조형변수의 기본값   null 로 초기화됨
		Score[]   arr = new Score[3];  // Score 객체가 만들어지지 않음
		// String result  =arr[0].toString();
		// NullPonterException
		
		arr[0]= new   Score("01", 100,90,50);
		arr[1]= new   Score("02", 95,100,80);
		arr[2]= new   Score("03", 85,90,99);
		
		
		for( Score score : arr) {
			System.out.println( score );
			// System.out.println( score.toString());
		}
		
	}

}
