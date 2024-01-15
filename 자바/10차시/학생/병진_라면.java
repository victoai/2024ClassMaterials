package 커피자판기프로그램;

public class 라면 {
	//클래스 멤버변수
	private int 물;
	private int 맵기;
	private int 계란추가;
	private int 매출;

	// 입력기능
	public void input(int a, int b, int c, int d) {
		물 = a;
		맵기 = b;
		계란추가 = c;
		매출 += d;
	}

	// 출력기능
	public void printInfo( ) {
		System.out.printf("물 : %d\n", 물);	
		System.out.printf("맵기 : %d단계\n", 맵기);	
		System.out.printf("계란추가 : %d개\n", 계란추가);	
		System.out.printf("현재 매출 : %d\n", 매출);	
	}
}
