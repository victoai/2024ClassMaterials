package week04.day4.ExceptionEx;

public class Ex04 {

	public static void main(String[] args) {
		 
		
		String su1_="10";
		String su2_="20안녕";
		
		try {
			int su1= Integer.parseInt(su1_);
			System.out.println( su1);
			
			int su2= Integer.parseInt(su2_);
			System.out.println( su2);
			
			int result = su1+ su2;
			System.out.println(  result);
		}catch(Exception  e) {
			e.printStackTrace();
		}

		System.out.println("정상종료");
	}

}
