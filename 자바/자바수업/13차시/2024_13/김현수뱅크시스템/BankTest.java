package day13.김현수뱅크시스템;

public class BankTest {

	public static void main(String[] args) {

		Kakao k = new Kakao(500000000, 1000000);
		k.overrallPrint();
		k.deposit(50000);
		k.overrallPrint();
		k.withdraw(1000000);
		k.overrallPrint();
		
		Toss t = new Toss(10000, 500);
		t.overrallPrint();
		t.deposit(500);
		t.overrallPrint();
		t.withdraw(10500);
		t.overrallPrint();


	}
}
