package prjDay11.runnable;

public class Runing implements MyRunnable{

	@Override
	public void run() {
		System.out.println("ok");
		int sum = 0;
		for(int i=0; i<=10;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
