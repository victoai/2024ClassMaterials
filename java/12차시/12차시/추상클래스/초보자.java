package 추상클래스;

public class 초보자 extends Player  {
	
	public 초보자() {
		// TODO Auto-generated constructor stub
	} 
	
	public 초보자(String name, String level) {		 
		super( name, level);
	} 
	
	@Override
	public void run() {
		System.out.println("천천히 달려요");
	}

	@Override
	public void jump() {
		System.out.println("점프는 아직 힘들어요");
	}

	@Override
	public void turn() {
		System.out.println("한쪽으로만 돌 수 있어요");
	}

}
