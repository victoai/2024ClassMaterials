package day20.thread;

public class 실습01 {

	public static void main(String[] args) {

		Eat e = new Eat();
		Sleep s = new Sleep();
		Toilet to = new Toilet();
		
		e.start();
		s.start();
		to.start();
	}

}

class Eat extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((i+1) + "번째 식사를 한다.");
		}
	}
}
class Sleep extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("낮잠을 잔다.");
		}
	}
}
class Toilet extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			try {
				sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("화장실을 간다.");
		}
	}
}
