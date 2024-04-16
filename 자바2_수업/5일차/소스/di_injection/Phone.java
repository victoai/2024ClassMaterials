package day5.di_injection;

public class Phone {
	
	
	//dependency   의존성	
	Bettery bettery;

	
	//setter 주입
	public void setBettery(Bettery bettery) {
		this.bettery = bettery;
	}
	
	
	public void powerOn() {		
		
		bettery.getEnergy();
		System.out.println("파워가 켜집니다");
		System.out.println("<<메뉴>>");
		System.out.println("1.전화걸기, 2.메세지보내기");
	}
	
	
	
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setBettery( new SMBettery());
		phone.powerOn();
	}
	

}
