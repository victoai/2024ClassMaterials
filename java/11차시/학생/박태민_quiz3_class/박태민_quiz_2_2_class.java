package day10.quiz;

public class 박태민_quiz_2_2_class {

// 쇼핑몰 주문

	long orderNum;
	String id;
	String orderDate;
	String orderName;
	String merchandiseNum;
	String address;

// 입력기능
	public void input(long orderNum, String id, String orderDate, String orderName, String merchandiseNum,
			String address) {

		this.orderNum = orderNum;
		this.id = id;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.merchandiseNum = merchandiseNum;
		this.address = address;
	}
	
// 출력기능
	public void printInfo() {
		System.out.println("주문번호 : " + this.orderNum);	
		System.out.println("주문자아이디 : " + this.id);	
		System.out.println("주문날짜 : " + this.orderDate);	
		System.out.println("주문자이름 : " + this.orderName);	
		System.out.println("주문상품번호 : " + this.merchandiseNum);	
		System.out.println("배송주소 : " + this.address);
		}
}
