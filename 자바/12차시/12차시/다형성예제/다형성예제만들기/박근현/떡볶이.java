package 과제;

public class 떡볶이 extends Order{

	@Override
	public void menu() {
		System.out.println("떡볶이 메뉴: 매운 떡볶이, 치즈 떡볶이");
	}

	@Override
	public void ordermenu() {
		System.out.println("주문(떡볶이)");
		System.out.println();
		System.out.println("주문 내용 없음");
	}	
	
	public void cancel() {
		System.out.println("떡볶이 주문을 취소하겠습니다.");
	}

}
