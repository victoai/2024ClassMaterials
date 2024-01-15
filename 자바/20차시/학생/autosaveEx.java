package day20.thread;

public class autosaveEx {

	public static void main(String[] args) {
		
		AutoSave s = new AutoSave();
		s.setDaemon(true);
		s.start();
		

		for(int i = 0; i<100; i++) {
			System.out.println((i+1)+". hi!!!!!!");
		}
		System.out.println("메인종료");
	}

}


class AutoSave extends Thread{
	void autosave() {
		System.out.println("==>자동저장완료");
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(3000);
				autosave();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}