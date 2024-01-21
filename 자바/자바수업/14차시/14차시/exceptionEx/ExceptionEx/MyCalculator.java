package week04.day4.ExceptionEx;

public class MyCalculator {
	
	public int add( int num1, int num2) throws MyException {
		if( num1 <0 ||  num2 <0) {
			 throw  new MyException("0보다 큰값이어야 합니다");			 
		}		
		return num1+ num2;
	}

	
	public double divide( int  num1,  int num2) {		
		if( num1<0   || num2 <0) {
			throw new MyException2("0보다 큰값이어야 합니다");
		}
		return  num1/ (double) num2;
	}
}
