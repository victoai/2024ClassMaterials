package prjDay12;

public class CalculatorEx {

	public static void main(String[] args) {
		 
		
		Calculator c = new Calculator();
		int result=0;
		 
	    try {
			result=c.add(-10, 3);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		 
		System.out.println( result);

		System.out.println("정상종료");
	}

}
