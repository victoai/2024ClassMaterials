package prjDay11.runnable;

public class Dog implements MyRunnable{

	@Override
	public void run() {
		String dog[]=new String[4];
		dog[0]=("   __      _");
		dog[1]=(" o'')}____//");
		dog[2]=("  `_/      )");
		dog[3]=("  (_(_/-(_/");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i]);
		}
		
	}

}
