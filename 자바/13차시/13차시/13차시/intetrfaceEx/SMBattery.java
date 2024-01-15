package week04.day3.intetrfaceEx;

public class SMBattery   implements  Battery{

	public SMBattery() {
		System.out.println("SM battery입니다.");
	}

	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴"); 
	}
}
