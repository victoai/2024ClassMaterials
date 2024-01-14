package day15.인터페이스;

public class Kjy implements MyRunnable {

	@Override
	public void run() {

		System.out.println(" 구구단 ");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i * j);
			}
		}

	}

}
