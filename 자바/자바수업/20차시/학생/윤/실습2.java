package algoPrj.day20.thread;

public class 실습2 {

	public static void main(String[] args) {

		Thread th1 = new Thread(new AnimalI());
		th1.start();

		Thread th2 = new Thread(new Animal2I());
		th2.start();

	}

}

////////////////////////////	
class AnimalI implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				System.out.println((i+1)+"팬더");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/////////////////////////////
class Animal2I implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(200);
				System.out.println((i+1)+"곰");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		}
	}

}
