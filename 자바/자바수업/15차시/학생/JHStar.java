package day15.인터페이스;

public class JHStar implements MyRunnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
