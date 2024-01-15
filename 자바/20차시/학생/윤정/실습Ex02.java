package day20.thread;

public class 실습Ex02 {
	
	
	public static void main(String[] args) {
	
	Thread4 th4 = new Thread4();
	Thread5 th5 = new Thread5();
	Thread6 th6 = new Thread6();
	
	
	th4.start();
	th5.start();
	th6.start();
	

	}

}


class Thread4 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1000);
				System.out.println((i+1) + " 아침");
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		
	}
}


class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(2000);
				System.out.println((i+1) + " 점심");
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}


class Thread6 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(3000);
				System.out.println((i+1) + " 저녁");
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
