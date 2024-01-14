package day15.인터페이스;

public class SYJ implements MyRunnable{

	@Override
	public void run() {
		System.out.println("예진코드==>");
		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
