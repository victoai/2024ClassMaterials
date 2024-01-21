package week03.day2.윤성님;

public class walletTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wallet wl =  new wallet(1,1,1,1,1,1,1,1); 	// 5만원권/1만원권/5천원권/1천원권 // 500원/100원/50원/10원
		
		//가지고 있는 현금의 총합
		System.out.println("=============");		
		wl.calTotalCash();
		
		//현금으로 지불하기
		System.out.println("=============");		
		wl.payByCash(5000);
		
		//선택한 카드로 지불하기
		System.out.println("=============");
		wl.payByCard(7000, "kakao"); 
		
		//카드잔여한도 조회
		System.out.println("=============");
		wl.checkCardLimit();
		
		
		
	}
		
		
}
