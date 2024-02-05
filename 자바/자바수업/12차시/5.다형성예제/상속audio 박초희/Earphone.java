package week04.day1.상속;

public class Earphone extends Audio{

	
	@Override
	public void sound() {
		if(volume>0)
			System.out.println("이어폰에서 소리가 나온다");
		else 
			System.out.println("이어폰 음소거");
	}
	
	public void leftSound() {
		System.out.println("이어폰 왼쪽에서 소리가 나온다");
	}
	public void rightSound() {
		System.out.println("이어폰 오른쪽에서 소리가 나온다");
	}
	
}
