package prjDay11.runnable;

public class Menu implements MyRunnable {

	@Override
	public void run() {
		int random = (int)((Math.random()*3));
		String[] menu = {"한식","중식","일식"};
		System.out.println("저녁은 "+menu[random]);
	}

}
