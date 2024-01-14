package 연습문제1;

public class Cat extends Animal{

	@Override
	public void sound() {
		super.sound();
		System.out.println("고양이");
	}
	
	public void animalsound() {
		System.out.println("야옹");
	}	
}