package thread;

public class project_박근현 {

	public static void main(String[] args) {
		
		Thread a = new Thread(new Thread2());
		a.start();
		
		Thread b = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100; i++) {
					System.out.println("카페라떼 주문 들어왔습니다.");
				}
			}
		});
		
		b.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("아메리카노 주문 들어왔습니다~");
		}
		
	}

}

class Thread2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("카푸치노 주문 들어왔습니다!");
		}
	}
}