package week03.day5.상속3;

public class CafeLatte extends Coffee{

	protected int milk;
	
	public CafeLatte() {
	}
	public CafeLatte(int espressoShot,int milk) {
		super(espressoShot);
		this.milk=milk;
	}
	
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public void makeCafeLatte() {
		setEspresso(2);
		setMilk(120);
		System.out.println("카페라떼입니다");
	}
	
	public void printCafeLatteInfo() {
		System.out.println("에스프레소 "+espressoShot+"샷");
		System.out.println("우유 "+milk+"ml");
	}
	
}
