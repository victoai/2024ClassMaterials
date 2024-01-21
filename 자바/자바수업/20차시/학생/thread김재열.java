package day20.thread;

public class thread김재열 {

	public static void main(String[] args) {

		Star1 str1 = new Star1();

		Star3 str3 = new Star3();
		str1.start();
		try {
			str1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str3.start();
	}
}

class Star1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}
}

class Star3 extends Thread {
	@Override
	public void run() {

		for (int i = 5; i > 0; i--) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
