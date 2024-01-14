package 연습문제1;

public class Dog extends Animal{

	@Override
	public void sound() {
		super.sound();
		System.out.println("강아지");
	}
	
	public void animalsound() {
		System.out.println("멍멍");
	}

}