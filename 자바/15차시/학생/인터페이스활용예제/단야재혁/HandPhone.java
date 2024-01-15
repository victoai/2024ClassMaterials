package day15.핸드폰;

public class HandPhone {
	
	private Battery batteryon, batteryoff;
	

	void getBattery(Battery batteryon) {
		this.batteryon=batteryon;
	}
	
	void outBattery(Battery batteryoff) {
		this.batteryoff=batteryoff;

	}
	

	void powerOn() {
		batteryon.getEnergy();
		System.out.println("핸드폰이 켜집니다.");
	}
	
	void powerOff() {
		batteryoff.getOutEnergy();
		System.out.println("핸드폰이 꺼집니다.");
	}

}
