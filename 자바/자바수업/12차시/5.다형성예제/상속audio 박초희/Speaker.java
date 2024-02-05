package week04.day1.상속;

public class Speaker extends Audio{

	
	@Override
	public void sound() {
		if(volume>0)
			System.out.println("스피커에서 소리가 나온다");
		else 
			System.out.println("스피커 음소거");
	}
	
	
}
