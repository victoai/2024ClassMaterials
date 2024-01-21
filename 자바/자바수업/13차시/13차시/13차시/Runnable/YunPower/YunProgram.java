package week04.day3.Runnable.YunPower;

import java.util.Scanner;

public class YunProgram implements MyRunnable{

	@Override
	public void run() {
		
		System.out.println("여기는 MyRunnable 인터페이스를 상속받은 YunProgram");
		System.out.println("Program2의 mainrun()이 실행하도록 요구한 ");
		System.out.println("<Myrunnable>runnable의 run메소드를 실행중");
		
		YunProgramSub a = new YunProgramSub();
		a.setPower(new YunPower());
		a.Calculate(); 
		
		
	}
	
}