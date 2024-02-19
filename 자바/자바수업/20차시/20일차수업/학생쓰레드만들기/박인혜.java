package thread;

public class 박인혜 {

	public static void main(String[] args) {
		
		// 이름있이
		Thread vomit = new Thread( new vomit());
		vomit.start();
		
		// 이름없이
		Thread th = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i=0; i<100; i++) {
					System.out.println("마신다");
				}
			}});
		th.start();

	}

}


class vomit implements Runnable{

	@Override
	public void run() {
		for( int i=0; i<100; i++) {
			System.out.println("토한다");
		}
	}
}
