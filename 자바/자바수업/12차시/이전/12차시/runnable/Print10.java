package prjDay11.runnable;
public class Print10  implements MyRunnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
}
