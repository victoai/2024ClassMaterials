package day10.classType;
// 정의하는 부분
// 틀 
class chocofra {
	//클래스 멤버변수
	private int 설탕;
	private int 얼음;
	private int 초콜릿파우더;
	private int 초콜릿시럽;
	private int 우유;
	private int 휘핑크림;

	// 입력기능
	public void input(int 설탕, int 얼음, int 초콜릿파우더, int 초콜릿시럽, int 우유, int 휘핑크림) {

		this.설탕 = 설탕;
		this.얼음 = 얼음;
		this.초콜릿파우더 = 초콜릿파우더;
		this.초콜릿시럽 = 초콜릿시럽;
		this.우유 = 우유;
		this.휘핑크림 = 휘핑크림;
	}

	// 출력기능
	public void printInfo( ) {
		System.out.println("설탕 : " + 설탕);
		System.out.println("얼음 : " + 얼음);
		System.out.println("초콜릿시럽 : " + 초콜릿시럽);
		System.out.println("초콜릿파우더 : " + 초콜릿파우더);
		System.out.println("우유 : " + 우유);
		System.out.println("휘핑크림 : " + 휘핑크림);
	}
}