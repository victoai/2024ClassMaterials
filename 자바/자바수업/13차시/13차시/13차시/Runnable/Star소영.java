package week04.day3.Runnable;

public class Star소영 implements MyRunnable {


	public Star소영() {
		System.out.println("<별찍기>");
	}
	
	@Override
	public void run() {
		System.out.println("여러모양의 별찍기");
	

	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		  Star소영 s= new Star소영();
		  s.run();
	}
	
	
	
}
