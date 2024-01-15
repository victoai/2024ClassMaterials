package week04.day4.ExceptionEx;

public class MyCalculatorTest {

	public static void main(String[] args) {
	 
		
		MyCalculator m = new MyCalculator();
		int result=0;
		try {
			result= m.add(10, -3);
			System.out.println( result);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("둘 중에 음수가 있어요");
			//e.printStackTrace();
		}
			 
		 System.out.println( result);		
		 double result2  = m.divide(10, -3);
		 System.out.println( result2);			 
		 System.out.println("정상종료");			
		
		
	}

}
