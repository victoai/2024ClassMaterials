package thread;

public class PokemonThreadEx {

	public static void main(String[] args) {
		
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<64; i++) {					
					System.out.println("FIGHT");
				}
			}
		});
		
		Thread2 th2=new Thread2();
		Thread th3=new Thread(new Thread3());
		
		System.out.println("Wild PIKACHU Appeared!");
		th1.start();
		th2.start();
		th3.start();
	}

}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<64; i++) {
			System.out.println("ITEM");
		}
	}
}

class Thread3 implements Runnable{
	public void run() {
		for(int i=0; i<64; i++) {			
			System.out.println("RUN");
		}
	}
}