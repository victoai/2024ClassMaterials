package thread;

public class MyThreadEx2 {

	public static void main(String[] args) {
		
		
		Thread th1 = new Thread(new Thread5());
		th1.start();
		
		Thread th2 = new Thread(new Thread6());
		th2.start();
}
}
class Thread5 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("오늘 점심!!!");
		}
		
	}
}
class Thread6 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("뭐먹지???");
		}
		
	}
}