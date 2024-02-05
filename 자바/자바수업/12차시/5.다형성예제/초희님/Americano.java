package week03.day5.상속3;

public class Americano extends Coffee{

	protected int water;
	
	public Americano() {
	}
	public Americano(int espressoShot, int water) {
		super(espressoShot);
		this.water = water;
	}
	
	public void setWater(int water) {
		this.water = water;
	}
	
	public void makeAmericano() {
		setEspresso(2);
		setWater(100);
		System.out.println("아메리카노입니다");
	}
	
	public void printAmericanoInfo() {
		System.out.println("에스프레소 "+espressoShot+"샷");
		System.out.println("물 "+water+"ml");
	}
	
	
}
