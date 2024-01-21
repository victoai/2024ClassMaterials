package day20.thread;

public class Thread연습 {

	public static void main(String[] args) {
		
//		for(int i=0; i<100; i++)
//			System.out.println((i+1) + "다운로드 하시겠습니까?");
//		
//		for(int i=0; i<100; i++)
//			System.out.println((i+1) + "다운로드 할게요");
//		
//		for(int i=0; i<100; i++)
//			System.out.println((i+1) + "다운로드 중입니다");
		
//		for(int i=0; i<100; i++)
//			System.out.println((i+1) + "다운로드 한다고!!");
		
		ThreadD1 th1 = new ThreadD1();
		th1.start();
		ThreadD2 th2 = new ThreadD2();
		th2.start();
		ThreadD3 th3 = new ThreadD3();
		th3.start();
		ThreadD4 th4 = new ThreadD4();
		th4.start();

	}

}

class ThreadD1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i+1) + "다운로드 하시겠습니까?");
		}
	}
}

class ThreadD2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1000);
				System.out.println((i+1) + "다운로드 중입니다");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}

class ThreadD3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1500);
				System.out.println((i+1) + "다운로드 할게요");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}

class ThreadD4 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				sleep(1700);
				System.out.println((i+1) + "다운로드 한다고!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
