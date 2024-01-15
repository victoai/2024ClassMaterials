package day09.quiz;

public class quiz_class02 {

	public static void main(String[] args) {

		quiz_class02_class content = new quiz_class02_class();
		
		System.out.println("주문이 들어왔습니다!");
		
		content.orderNum = 201803120001L;
		content.id = "abc123";
		content.orderDate = "2018년3월12일";
		content.orderName = "홍길순";
		content.merchandiseNum = "AD0345-12";
		content.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + content.orderNum);	
		System.out.println("주문자아이디 : " + content.id);	
		System.out.println("주문날짜 : " + content.orderDate);	
		System.out.println("주문자이름 : " + content.orderName);	
		System.out.println("주문상품번호 : " + content.merchandiseNum);	
		System.out.println("배송주소 : " + content.address);
		

	}

}
