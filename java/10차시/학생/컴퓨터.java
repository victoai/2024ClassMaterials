package day10.classType;
// 정의하는 부분
// 틀 
class 컴퓨터 {
	//클래스 멤버변수
	int 모니터;
	int 키보드;
	int 마우스;
	int 책상;
	int 의자;

	// 입력기능
	public void input2(int 모니터, int 키보드, int 마우스, int 책상, int 의자) {
		this.모니터 = 모니터;
		this.키보드 = 키보드;
		this.마우스 = 마우스;
		this.책상 = 책상;
		this.의자 = 의자;
	}

	// 출력기능
	public void printInfo2( ) {
		System.out.println( 모니터);  // this.물;
		System.out.println( 키보드);
		System.out.println( 마우스);
		System.out.println( 책상);
		System.out.println( 의자);		
	}
}