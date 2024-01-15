package algoPrj.day20.thread;

public class 실습 {

	public static void main(String[] args) {

		Animal th1 = new Animal();
		th1.start();

		Animal2 th2 = new Animal2();
		th2.start();

	}

}

////////////////////////////	
class Animal extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				sleep(100);
				System.out.println((i+1)+"팬더");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/////////////////////////////
class Animal2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(200);
				System.out.println((i+1)+"곰");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		}
	}

}
