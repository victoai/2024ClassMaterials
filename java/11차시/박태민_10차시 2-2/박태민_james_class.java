package day11.생성자;

public class 박태민_james_class {

// 사람정보
	private int age;
	private String name;
	private String gender;
	private boolean isMarried;
	private int child;

//입력기능
	public 박태민_james_class(int age, String name, String gender, boolean isMarried, int child) {
		
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
	
	public String toString() {
		return "나이가 "+age+"살, 이름이 "+name+"인 "+gender+"가 있습니다.\n이 사람은 결혼한 "+isMarried+"가 있고 자식이 "+child+"명 있습니다.";
	}
}
