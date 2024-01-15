package prjDay11.runnable;

public class PMJA implements MyRunnable {
	
	@Override
	public void run() {
		System.out.println("====피보나치 수열(10항)구하기====");
		int[] fibo = new int[10];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2;i<fibo.length;i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
			
		}
		for(int i=0;i<fibo.length;i++) {
			System.out.print(fibo[i]+ "\t");
		}
		
		
		
	}

}
