package day10.quiz;

// 정의하는 부분
// 틀 
class 박태민_quiz1_class {
	// 클래스 멤버변수
	private int 기타1;
	private int 기타2;
	private int 베이스;
	private int 드럼;
	private int 보컬;

	// 입력기능
	public void input(int 기타1, int 기타2, int 베이스, int 드럼, int 보컬) {
		this.기타1 = 기타1;
		this.기타2 = 기타2;
		this.베이스 = 베이스;
		this.드럼 = 드럼;
		this.보컬 = 보컬;
	}

	// 출력기능
	public void printVol() {
		System.out.printf("기타1 = %d%n", 기타1);
		System.out.printf("기타2 = %d%n", 기타2);
		System.out.printf("베이스 = %d%n", 베이스);
		System.out.printf("드럼 = %d%n", 드럼);
		System.out.printf("보컬 = %d%n", 보컬);
	}
}