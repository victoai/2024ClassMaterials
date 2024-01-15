package week04.day3.Runnable;

public class Jjyrun implements MyRunnable{
	@Override
	public void run() {
		int index = 0;
		for (int i = 0; i<5; i++) {
			for (int k=5; k>index; k--)
				{System.out.print(" ");}
			for (int j=0; j<=index*2; j++)
				{System.out.print("*");}
			System.out.println();
			index++;
			}
		for (int i = 0; i<=5; i++) {
			for (int k=5; k>index; k--)
				{System.out.print(" ");}
			for (int j=0; j<=index*2; j++)
				{System.out.print("*");}
			System.out.println();
			index--;
		}
	}
}
