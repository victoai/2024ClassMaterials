package week04.day3.Runnable;

public class YhRun implements MyRunnable{

	@Override
	public void run() {
		System.out.println("김영현 Run");
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
	System.out.println("1부터 10까지의 합: " + sum);
	}

}
   