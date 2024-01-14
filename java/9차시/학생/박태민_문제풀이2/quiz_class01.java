package day09.quiz;

public class quiz_class01 {

	public static void main(String[] args) {

		quiz_class01_class man = new quiz_class01_class();
		
		man.age = 40;
		man.name = "james";
		man.gender = "남자";
		man.isMarried = true;
		man.child = 3;
		
		System.out.println("나이가 " + man.age + "살, 이름이 " + man.name
				+ "인 " + man.gender + "가 있습니다.");
		System.out.println("이 " + man.gender + "는 결혼한 " + man.isMarried
				+ "가 있고 자식이 " + man.child + "명 있습니다.");
	}

}
