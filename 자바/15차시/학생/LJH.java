package day15.인터페이스;

public class LJH implements MyRunnable{

	@Override
	public void run() {
		for(int i =0; i<3;i++) {
			for(int j =3; j>=i; j--) {
				System.out.print(" ");	
				}
			for(int j=1; j<=1+i*2;j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	}
	
}
