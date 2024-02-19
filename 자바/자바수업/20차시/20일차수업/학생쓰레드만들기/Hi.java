package thread;

public class Hi {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Bye!");
				}
			}
		});
		th.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("Hi!!");
		}
	}

}
