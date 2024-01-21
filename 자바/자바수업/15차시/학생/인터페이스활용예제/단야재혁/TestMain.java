package day15.핸드폰;

public class TestMain {

	public static void main(String[] args) {
		HandPhone cellPhone = new HandPhone();
		
		LgBattery lg = new LgBattery();
		
		cellPhone.getBattery(lg);
		cellPhone.powerOn();
		
		System.out.println("=================");
		
		SMBattery sm = new SMBattery();
		
		cellPhone.outBattery(sm);
		cellPhone.powerOff();
		
		
	}

}
