package day3.day3.lamda복습;

import java.util.Scanner;

public class Runnable학생 {

	public static void main(String[] args) {
		
		Runnable khs = () -> {
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					System.out.println(i + "X" + j + " = " + i*j);
				}
				System.out.println("");
			}
		};
		
		
	  khs.run();
		

	  
		Runnable kjy = () -> {

			// 실행하고 싶은 코드
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i * j);
				}
			}
		};
		kjy.run();
		
		 
		
		Runnable min = ()->{			
			for(int i = 1; i<=19; i++) {
				System.out.println(4 *i);
			}
		
		};
		min.run();
		
		
		Runnable syj = ()->{
			
			for(int i=0;i<5;i++) {				
				System.out.print("★");
			}
			System.out.println("별이다섯개!!");
		};
		syj.run();
		
		Runnable bj = ()->{
			int c = 3;
			for(int i =1; i<=4; i++) {
				System.out.println(c+i);
			}
		};
		bj.run();
		
		// 람다식으로 실행하고 싶은 코드!!!
				Runnable r4 = ()-> {
					System.out.println("코딩은 어려워");
				
					System.out.println("╭┈┈┈┈╯   ╰┈┈┈╮\r\n"
							+ "\r\n"
							+ "╰┳┳╯    ╰┳┳╯\r\n"
							+ "\r\n"
							+ "N 　    N\r\n"
							+ "\r\n"
							+ "○       ○\r\n"
							+ "   ╰┈┈╯\r\n"
							+ " O ╭━━━━━╮　 O\r\n"
							+ "    ┈┈┈┈\r\n"
							+ "　o     　　 o\r\n"
							+ "");
				
					};
				r4.run();
				
				Runnable hjhcode = () -> { 
					for(int i=2; i<=9; i++) {
						for(int j=1; j<=9; j++)
					System.out.println(i*j);
					}
				};
				hjhcode.run();
				
				
				Runnable juntae = () ->System.out.println("다들 화이팅 ฅʕ•.•ʔฅ");				
				juntae.run();
				
				
				Runnable lyj = () -> {					
					System.out.println("o(*￣▽￣*)ブ 파이팅입니다");					
				};			
				
				lyj.run();
		
	}

}
