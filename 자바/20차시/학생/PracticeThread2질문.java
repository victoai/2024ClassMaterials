package day20.thread;

public class PracticeThread2 {
	
	static int num;

	public static void main(String[] args) {
		try {
			for (num = 0; num < 9; num++) {
				ThreadAcorn thA = new ThreadAcorn();
				thA.start();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ThreadAcorn extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
				System.out.println(((10-PracticeThread2.num+1) + "번째 기수는 현재 수료까지 " + (100 - i) + "일 남았습니다."));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		ThreadAcornEnd thAE = new ThreadAcornEnd();
		thAE.start();
	}
}

class ThreadAcornEnd extends Thread {
	@Override
	public void run() {
		System.out.println((PracticeThread2.num+1) + " 번째 기수가 수료 완료했습니다.");
	}
}
