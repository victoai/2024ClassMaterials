package day07;

public class MoneyCount02 {

	public static void main(String[] args) {
		
		int MyMoney = 578780;
		
		int MoneyArr[] = {50000,10000,5000,1000,500,100,50,10};
		
		int MyWallet[] = new int[8];
		
		for(int i=0; i<MoneyArr.length; i++) {
			MyWallet[i] = MyMoney / MoneyArr[i];
			MyMoney = MyMoney % MoneyArr[i];
		}
		
		for(int i=0; i<MoneyArr.length; i++) {
			System.out.println(MoneyArr[i] + "원 단위는 " +MyWallet[i] + "개 있습니다.");
		}
		
	}
}
