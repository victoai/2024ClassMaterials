package week04.day3.intetrfaceEx;

public class HandPhone {
	private Battery battery;  //	
	
	void setBattery(Battery battery)
	{
		this.battery = battery;
	}
	
	void powerOn() {
		battery.getEnergy();
		System.out.println("핸드폰이 켜집니다.");
	}
}
