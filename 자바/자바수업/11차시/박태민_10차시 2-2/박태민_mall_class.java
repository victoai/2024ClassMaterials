package day11.생성자;

public class 박태민_mall_class {

// 쇼핑몰 주문

	private long orderNum;
	private String id;
	private int orderDate;
	private String orderName;
	private String merchandiseNum;
	private String address;

// 입력기능
	public 박태민_mall_class(long orderNum, String id, int orderDate, String orderName, String merchandiseNum,
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
	
	public String toString() {
		return "주문번호 : "+orderNum+"\n주문자아이디 : "+id+"\n주문날짜 : "+orderDate+"\n주문자이름 : "+orderName+"\n상품번호 : "+merchandiseNum+"\n배송주소 : "+address;
	}
}
