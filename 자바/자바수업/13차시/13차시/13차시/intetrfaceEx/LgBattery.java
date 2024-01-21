package week04.day3.intetrfaceEx;

public class LgBattery implements Battery {	
	public LgBattery() {
		System.out.println("LG battery입니다.");
	}

	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴"); 
	}
	 
 
}
