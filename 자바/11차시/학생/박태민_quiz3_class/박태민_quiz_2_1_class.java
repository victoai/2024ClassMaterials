package day10.quiz;

public class 박태민_quiz_2_1_class {

// 사람정보
	int age;
	String name;
	String gender;
	boolean isMarried;
	int child;

//입력기능
	public void input(int age,String name, String gender, boolean isMarried, int child) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.isMarried = isMarried;
		this.child = child;
	}

// 출력기능
	public void printInfo() {
		System.out.println("나이가 " + this.age + "살, 이름이 " + this.name + "인 " + this.gender + "가 있습니다.");
		System.out.println("이 " + this.gender + "는 결혼한 " + this.isMarried + "가 있고 자식이 " + this.child + "명 있습니다.");
	}
}
