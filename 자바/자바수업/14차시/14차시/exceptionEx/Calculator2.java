package prjDay12;

public class Calculator2 {	
	//양수인경우만 기능을 제공하겠다
	public int add( int num1,  int num2)  {   // checked 예외 		
		if( num1 <0  || num2 <0 ) {
			  throw new MyException2("0보다 커야함");  //예외를 일으키는 코드 
		}			
		return num1+ num2;
	} 
}
