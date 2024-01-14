package 과제;

	public class 라면 extends Order {

		@Override
		public void menu() {
			System.out.println("라면 메뉴: 일반 라면, 치즈 라면, 매운 라면");
		}

		@Override
		public void ordermenu() {
			System.out.println("주문(라면)");
			System.out.println();
			System.out.println("치즈 라면 1개");
		}
		
		public void cancel() {
			System.out.println("라면 주문을 취소하겠습니다.");
		}
}