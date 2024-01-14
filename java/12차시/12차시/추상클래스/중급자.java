package 추상클래스;

public class 중급자 extends Player  {
	
	public 중급자() {
		// TODO Auto-generated constructor stub
	} 
	
	public 중급자(String name, String level) {		 
		super( name, level);
	} 
	
	@Override
	public void run() {
		System.out.println("중간속도로 달려요");
	}

	@Override
	public void jump() {
		System.out.println("점프높이가 5입니다");
	}

	@Override
	public void turn() {
		System.out.println("양쪽으로 다 턴이 가능해요");
	}

}
