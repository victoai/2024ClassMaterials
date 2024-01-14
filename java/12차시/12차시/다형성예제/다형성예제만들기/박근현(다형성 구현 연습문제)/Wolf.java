package 연습문제1;

public class Wolf extends Animal {

	@Override
	public void sound() {
		super.sound();
		System.out.println("늑대");
	}
	
	public void animalsound() {
		System.out.println("아우~");
	}

}
