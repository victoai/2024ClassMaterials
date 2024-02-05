package week04.day1.상속;

public class Audio {
	
	 int volume=0;
	
	public void sound() {
		if(volume>0)
			System.out.println("소리가 나온다");
		else 
			System.out.println("음소거");
	}
	
	public  void volumeUp() {
		volume++;
	}
	public   void volumeDown() {
		if(volume>0)
		  volume--;
	}
	
	public  void printVolume() {
		System.out.println("볼륨 "+volume);
	}
	
}
