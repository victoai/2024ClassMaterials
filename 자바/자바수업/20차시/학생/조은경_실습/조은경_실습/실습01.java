package day0816.thread.EX;

public class 실습01 {

	public static void main(String[] args) {

		SHINeeJ j = new SHINeeJ();
		j.start();
		
		SHINeeK k = new SHINeeK();
		k.start();
		
		SHINeeM m = new SHINeeM();
		m.start();
		
		SHINeeT t = new SHINeeT();
		t.start();
		
		
	}

}

class SHINeeJ extends Thread{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				sleep(1000);
				System.out.println((i+1) + " 종현");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SHINeeK extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				sleep(2000);
				System.out.println((i+1) + " 키");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SHINeeM extends Thread{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				sleep(3000);
				System.out.println((i+1) + " 민호");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SHINeeT extends Thread{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				sleep(4000);
				System.out.println((i+1) + " 태민");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
