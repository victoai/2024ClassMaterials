package day13.김현수뱅크시스템;

public class Kakao extends BankSystem{
	
	public Kakao(int bankMoney, int myMoney) {
		super(bankMoney, myMoney);
	}
	
	@Override
	public void overrallPrint() {
		System.out.println("-----------------------------------------");
		System.out.println("현재 카카오 뱅크를 이용중입니다.");
		System.out.println("나의 계좌에는 " + myMoney + "원 입니다.");
		System.out.println("카카오뱅크의 총자산은 " + bankMoney + "원 입니다.");
		System.out.println("-----------------------------------------");
	}
	
	
 
	
 
	
}
