package java_day10_classType;

public class 학생_허재혁 {
	
	String 이름 = "홍길동";
	int 나이 = 29;
	String 생일 = "7월7일";
	
	public void printInfo() {
		System.out.println("출력");
		System.out.println("이름: "+this.이름);
		System.out.println("나이: "+this.나이);
		System.out.println("생일: "+this.생일);
	}
	
	public void plus() {
		this.나이 += 1;
	}
	

}
