package day15.핸드폰;

public class SMBattery implements Battery {

	public SMBattery() {
		System.out.println("SM Battery입니다.");
	}
	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
	}
	@Override
	public void getOutEnergy() {
		System.out.println("에너지 아웃");
	}
	
	
	


}
