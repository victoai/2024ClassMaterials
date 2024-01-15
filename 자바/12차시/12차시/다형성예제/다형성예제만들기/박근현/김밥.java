package 과제;

public class 김밥 extends Order {

	@Override
	public void menu() {
		System.out.println("김밥 메뉴: 치즈김밥, 돈까스김밥, 참치김밥");
	}

	@Override
	public void ordermenu() {
		System.out.println("주문(김밥)");
		System.out.println();
		System.out.println("치즈김밥 1개, 돈까스김밥 2개");
	}
	
	public void cancel() {
		System.out.println("김밥 주문을 취소하겠습니다.");
	}
}
