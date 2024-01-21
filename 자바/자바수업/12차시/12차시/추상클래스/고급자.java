package 추상클래스;

public class 고급자 extends Player  {
	
	public 고급자() {
		// TODO Auto-generated constructor stub
	} 
	
	public 고급자(String name, String level) {		 
		super( name, level);
	} 
	
	@Override
	public void run() {
		System.out.println("굉장히 빨라요");
	}

	@Override
	public void jump() {
		System.out.println("점프 20 할 수 있어요");
	}

	@Override
	public void turn() {
		System.out.println("빠르게 양쪽으로 턴 할 수 있어요");
	}

}
