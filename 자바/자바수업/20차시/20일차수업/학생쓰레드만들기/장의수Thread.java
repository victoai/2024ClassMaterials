package thread;

import java.util.Scanner;

public class 장의수Thread {

	public static void main(String[] args) {
		Thread th = new Thread(new choose());
		th.start();
	}

}

class choose implements Runnable {
	Scanner sc = new Scanner(System.in);
	turnNum tn = new turnNum();

	@Override
	public void run() {
		loop: while (true) {
			System.out.println("1번을 눌러 룰렛을 돌리고, 2번을 눌러 룰렛을 멈추세요.");
			switch (sc.next()) {
			case "1":
				tn.start();
				break;

			case "2":
				tn.run = false;
				break loop;
			}
		}

	}

}

class turnNum extends Thread {
	Boolean run = true;
	int num = 0;

	@Override
	public void run() {
		while (run) {
			if (num >= 100) {
				num = 0;
			}
			num++;
			System.out.println(num);
		}
		System.out.println("당신의 점수는: " + num);

	}

}
