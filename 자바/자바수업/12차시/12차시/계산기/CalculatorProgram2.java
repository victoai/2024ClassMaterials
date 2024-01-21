package prjDay11.계산기;

import java.util.Scanner;

public class CalculatorProgram2 { 	
	 private  Calculator  calculator ; 
	 
	 public CalculatorProgram2() {}
	 public CalculatorProgram2(Calculator calculator) {
		  this.calculator = calculator;
	 }
	 public void run() {		 
		 Scanner sc= new Scanner(System.in);
		    // 두 수를 입력하시오
		 int num1 = sc.nextInt();
		 int num2= sc.nextInt(); 
		 // 더하기
		 int result  =calculator.addAcorn(num1, num2);
		 System.out.println( result); 
	 }	 
	/*
	 public static void main(String[] args) {
		  
		   CalculatorProgram2 c = new CalculatorProgram2( new WJYCalculatorImp());		   
		   c.run();
	 } 
	*/

}
