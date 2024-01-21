package day11.생성자;

public class 박태민_mall {

	public static void main(String[] args) {

		System.out.println("주문번호, 아이디, 날짜, 이름, 품번, 주소");
		
		박태민_mall_class order = 
				new 박태민_mall_class(2038914, "tmpark11", 20230801, "박태민", "acorn-123", "서울시 영등포구");

		String result = order.toString();
		System.out.println(result);
	}

}
