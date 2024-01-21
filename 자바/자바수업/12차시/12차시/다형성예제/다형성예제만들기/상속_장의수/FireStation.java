package 상속_장의수;

public class FireStation extends Building {
	FireFighter[] fire_fighters;
	
	public FireStation() {
	}
	
	public FireStation(String name, String where,FireFighter[] f) {
		super(name,where);
		fire_fighters =f;
	}
	
	@Override
	public void move() {
		System.out.println("소방대원들 출동!");
	}
}
