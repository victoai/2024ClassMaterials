package day10.quiz;

public class 박태민_quiz_2_2 {

	public static void main(String[] args) {

		박태민_quiz_2_2_class order = new 박태민_quiz_2_2_class();

		System.out.println("주문번호, 아이디, 날짜, 이름, 품번, 주소를 입력하세요");
		order.input(1234125, "tmpark11", "230731", "박태민", "acorn-32", "서울시 영등포구");
		
		order.printInfo();

	}

}
