package week03.day5.상속3;

public class Coffee {

	protected int espressoShot;
	
	public Coffee() {
		
	}
	public Coffee(int espressoShot) {
		this.espressoShot = espressoShot;
	}
	
	public void setEspresso(int espressoShot) {
		this.espressoShot = espressoShot;
	}
	
	public void makeEspresso() {
		setEspresso(1);
		System.out.println("에스프레소입니다");
	}
	
	public void printInfo() {
		System.out.println("에스프레소 "+espressoShot+"샷");
	}
	
	
}
