package day10.quiz;

public class 박태민_quiz_2_1 {

	public static void main(String[] args) {

		박태민_quiz_2_1_class james = new 박태민_quiz_2_1_class();
		System.out.println("나이 이름 성별 결혼여부 자식수 순으로 입력하세요");
		james.input(20, "james", "male", true, 3);	
		james.printInfo();
	}

}
