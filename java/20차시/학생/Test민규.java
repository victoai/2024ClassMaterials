package day20.thread;

public class Test민규 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest tt = new ThreadTest();
		Alert aa = new Alert();
		tt.start();
		aa.start();

	}

}

class ThreadTest extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			try {
				sleep(1000);
				if (i == 0)
					i = 10;
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Alert extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				if (i == 10)
					i = 1;
				if (i ==1){
				sleep(11000);
			System.out.println("핵미사일 발사!");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}