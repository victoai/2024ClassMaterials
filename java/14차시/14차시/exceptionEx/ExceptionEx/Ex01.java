package week04.day4.ExceptionEx;

public class Ex01 {

	public static void main(String[] args) {
		 // 예외 - 선택 { try~ catch )
		
		int[]  arr= { 10,20,30};		
		try {		
			for( int i=0 ; i<= arr.length ; i++) {
				System.out.println( arr[i]);
			}
		
		}catch(Exception e) {
			//예외발생시 수행되어야 하는 코드를 작성하는 것 
			System.out.println("배열의 범위를 벗어남");
			e.printStackTrace();
		}
		
		System.out.println(" 정상 종료합니다");

	}

}
