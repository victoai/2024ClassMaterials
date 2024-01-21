package day20.thread;

import java.util.Scanner;

public class 태민_실습 {

	public static void main(String[] args) {

		Thread th1 = new Thread(new Timer());
		th1.start();

		downloading th2 = new downloading();
		th2.start();
	}

}

class Timer implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("타이머를 설정할 시간(초 단위)을 입력하세요");
		long time = sc.nextInt();
		System.out.println(time + "초 후 알람이 울립니다");
		try {
			Thread.sleep(time*1000);
			System.out.println(time + "초가 지났습니다!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class downloading extends Thread {
	@Override
	public void run() {
		for (int i = 100; i >0 ; i--) {
			try {
				sleep(1000);
				System.out.println(i+"초 후 다운로드 완료됩니다");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}