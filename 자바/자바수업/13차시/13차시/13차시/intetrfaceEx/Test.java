package week04.day3.intetrfaceEx;

public class Test {

	public static void main(String[] args) {
		HandPhone cellphone = new HandPhone();
		//LgBattery lg = new LgBattery();
		//cellphone.setBattery(lg);
		
		SMBattery sm = new SMBattery();
		cellphone.setBattery(sm);
		cellphone.powerOn();

	}

}
