package day20.thread;

public class JHThread {
	public static void main(String[] args) {

		JHThread1 jh1 = new JHThread1();
		jh1.start();

		JHThread2 jh2 = new JHThread2();
		jh2.start();
		
		JHThread3 jh3 = new JHThread3();
		jh3.start();
		
		JHThread4 jh4 = new JHThread4();
		jh4.start();
	}
}

class JHThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "공부하기");
		}
	}
}

class JHThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "잠자기");
		}
	}
}

class JHThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i + 1) + "놀기");
		}
	}
}

class JHThread4 extends Thread{
	@Override
	public void run() {
		try {
			sleep(14000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@@@@@@@@@@끝@@@@@@@@@@@");
	}
}
