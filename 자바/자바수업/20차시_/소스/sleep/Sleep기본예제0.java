package day20.thread.sleep;

public class Sleep기본예제0 {

	public static void main(String[] args) {
		 

		new SleepThread().start();
	}

}




class  SleepThread extends Thread{	
	@Override
	public void run() {
		System.out.println(" 3초후에 공개합니다");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {     
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("짜짠 ~~~  3초가 지났어요  .. ");
	}
}