package prjDay11.계산기;

import java.util.Scanner;

public class CalculatorProgram {
	
	 public static void main(String[] args) {
		 
		 //WJYCalculatorImp c = new WJYCalculatorImp();
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("두 수입력");
		 int num1= sc.nextInt();
		 int num2= sc.nextInt();
		 
		 
		// Calculator c = new WJYCalculatorImp();		
	    //  Calculator c = new PMJCalculatorImp();		
		 
 		// Calculator c = new  KBJCalculatorlmp();	
	     //Calculator c = new  LeeCalculatorImp();
	     //Calculator c = new  LKICalculatorImp();
	     //  Calculator c = new  PGHCalculatorImp();
		 
		// Calculator c = new  PGHCalculatorImp();
	     //  Calculator c = new  PIHCalculatorImp();
	     //Calculator c = new  PMJCalculatorImp();
		// Calculator c = new  GardenCalculatorImp();
		// Calculator c = new  JHJCalculatorImp();
		 
		  Calculator c = new  CIHCalculatorImp();
				 
		 int result  =c.addAcorn(num1, num2);
		 System.out.println( result);
		 
		
		 
		 int result2  =c.subAcorn(num1, num2);
		 System.out.println( result2);
		
		 
		 
		 int result3  =c.multiplyAcorn(num1, num2);
		 System.out.println( result3);
		
		 double result4 = c.devideAcorn(num1, num2);
		 System.out.println( result4);
		 
		 
		 
	 } 
	

}
