package day20.thread;

public class SYJ_Thread연습 {

	public static void main(String[] args) {

		SStock st = new SStock();
		st.start();
		
		SStock2 st2 = new SStock2();
		st2.start();
	}

}

class SStock extends Thread{
	@Override
	public void run() {
		
		for(int i=0; i<100;i++) { // 비교할게 너무 적으면 섞이지 않을 수 있음.
			System.out.println("재입고 알람신청");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SStock2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			
			System.out.println("품절입니다.");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}