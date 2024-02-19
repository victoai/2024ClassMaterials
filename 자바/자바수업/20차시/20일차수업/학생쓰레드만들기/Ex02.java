
public class Ex02 {

	public static void main(String[] args) {
		Th03 tt=new Th03();
		tt.start();
		
			
			Thread tv=new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0; i<1000; i++) {
						System.out.println("111111");
				}
					
				}
			
	});tv.start();
			}
	}

		
class Th03 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("22222");
		}
		
	}
}