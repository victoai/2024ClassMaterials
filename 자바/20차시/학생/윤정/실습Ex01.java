package day20.thread;

public class 실습Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread th1 = new Thread(new RunImp());
		th1.start();
		
		
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<100; i++)
					System.out.println((i+1) + " 달리기");
				
			}});
		
		th2.start();
		

	}

}



//Runnable 인터페이스를 구현한 이름 있는 클래스 작성
class RunImp implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println((i+1) + " 멈추기");
		}
	}
	
}
