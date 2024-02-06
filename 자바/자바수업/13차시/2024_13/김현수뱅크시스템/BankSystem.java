package day13.김현수뱅크시스템;

public abstract class BankSystem implements BankI {

	int bankMoney;
	int myMoney;

	public BankSystem() {
	};

	public BankSystem(int bankMoney, int myMoney) {
		this.bankMoney = bankMoney;
		this.myMoney = myMoney;
	}

	@Override
	public void deposit(int Money) {
		this.bankMoney += Money;
		this.myMoney -= Money;
		System.out.println(Money + "원을 입금합니다.");
	}

	@Override
	public void withdraw(int Money) {
		this.bankMoney -= Money;
		this.myMoney += Money;
		System.out.println(Money + "원을 출금합니다.");
	}

	public abstract void overrallPrint();
}
