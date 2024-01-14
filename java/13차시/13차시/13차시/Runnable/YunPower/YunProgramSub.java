package week04.day3.Runnable.YunPower;

import java.util.Scanner;

public class YunProgramSub extends YunProgram{
	
	private Power power;
	
	void setPower(Power power) {
		this.power = power;
	}
	
	void Calculate() {
		int num1;
		int num2;
				
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
				
		int result = power.getPower(num1,num2);
		System.out.println(result);
	}

}
