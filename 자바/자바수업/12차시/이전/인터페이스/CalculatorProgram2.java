package day12.인터페이스;

import java.util.Scanner;

public class CalculatorProgram2 { 	
	 private  CalculatorI  calculator ; 
	 
	 public CalculatorProgram2() {}
	 public CalculatorProgram2(CalculatorI calculator) {
		  this.calculator = calculator;
	 }
	 public void run() {		 
		 Scanner sc= new Scanner(System.in);
		    // 두 수를 입력하시오
		 int num1 = sc.nextInt();
		 int num2= sc.nextInt(); 
		 // 더하기
		 int result  =calculator.add(num1, num2);
		 System.out.println( result); 
	 }	 
	 
	 public static void main(String[] args) {
		  
		//   CalculatorProgram2 c = new CalculatorProgram2( new WJYCalculatorImp());		   
		//   c.run();
	 } 
	 

}
