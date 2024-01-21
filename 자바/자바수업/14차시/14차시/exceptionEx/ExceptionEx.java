package prjDay12;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kors = new int[] {100,90,80};     // 0   1   2
		
		//예외처리 : 선택 (해도되고 안해도 됩니다 => 방법:한 가지  :try~ catch
		
		try {
			System.out.println(kors[3]);
		}catch(ArrayIndexOutOfBoundsException e) {         // ArrayIndexOutOfBoundsException
			System.out.println("배열의 범위를 벗어남");
		    System.out.println( e.getMessage());			
		}
		   
		System.out.println("프로그램 종료");
	}

}
