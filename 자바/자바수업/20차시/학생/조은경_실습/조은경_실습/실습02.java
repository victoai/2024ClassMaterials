package day0816.thread.EX;

public class 실습02 {

	public static void main(String[] args) {

		Thread j = new Thread(new SHINeeJI());
		j.start();
		
		Thread k = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					try {
						Thread.sleep(2000);
						System.out.println((i+1) + ". 키 " + ((i+1)*2000));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		k.start();
		
		Thread m = new Thread();
		m.start();
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					try {
						Thread.sleep(4000);
						System.out.println((i+1) + ". 태민 " + ((i+1)*4000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
		
		
	}

}

class SHINeeJI implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println((i+1) + ". 종현 " + ((i+1)*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class SHINeeMI implements Runnable{
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(3000);
				System.out.println((i+1) + ". 민호 " + ((i+1)*3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

