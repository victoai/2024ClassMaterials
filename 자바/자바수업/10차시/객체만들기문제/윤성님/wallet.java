package week03.day2.윤성님;

public class wallet {
	
	private String cardName[] = {"kakao","shinhan"};
	private int cardLimit[] = {5000000,5000000};
//	private String ID;
	private int[] note = new int[4];	// 5만원권/1만원권/5천원권/1천원권
	private int[] coin = new int[4];	// 500원/100원/50원/10원
	private int totalCash;
	
	public wallet() {
		
	}
	public wallet(int N50000, int N10000, int N5000, int N1000, int C500, int C100, int C50, int C10) {
//		cardLimit[0]=5000000; cardLimit[1]=5000000;	//각각의 카드의 한도 500만원
		note[0]=N50000; note[1]=N10000; note[2]=N5000; note[3]=N1000;
		coin[0]=C500; coin[1]=C100; coin[2]=C50; coin[3]=C10;
	}
	
	public void checkCardLimit() {
		for(int i=0; i<this.cardName.length; i++) {
			System.out.println("지불한 금액:"+this.cardName[i]+"입니다");
			System.out.println("잔여카드한도는:"+cardLimit[i]+"입니다");
		}
	}
	
	public void payByCard(int cost, String cardName) {
		for(int i=0; i<this.cardName.length; i++) {
			if(this.cardName[i]==cardName) cardLimit[i] = cardLimit[i]-cost;
			System.out.println("지불한 금액:"+cost+"입니다");
			System.out.println("잔여카드한도는:"+cardLimit[i]+"입니다");
		}
	}
	
	public void payByCash(int cost) {
		totalCash = totalCash-cost;
		System.out.println("지불한 금액:"+cost+"입니다");
		System.out.println("지불하고 남은 현금의 합은:"+totalCash+"입니다");

	}
	
//	public void showID() {
//	}
	
	public int calTotalCash() {
		int sum=0;
		sum = note[0]*50000 + note[1]*10000 + note[2]*5000 + note[3]*1000;
		sum = sum + coin[0]*500 + coin[1]*100 + coin[2]*50 + coin[3]*10;
		totalCash = sum;
		System.out.println("현재 가지고 있는 현금의 합은:"+totalCash+"입니다");
		return totalCash;
	}
}
