package week04.day3.Runnable;

				// interface 상속
public class A implements MyRunnable {

	@Override
	public void run() {
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
	
}
