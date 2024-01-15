package week03.day2.영빈님;

public class 컴퓨터 {

	String cpu;
	String 메인보드;
	String 메모리;
	String 그래픽카드;
	String SSD;
	String 파워;
	
	public void input(
			String cpu,
			String 메인보드,
			String 메모리,
			String 그래픽카드,
			String SSD,
			String 파워
			) {
		this.cpu=cpu;
		this.메인보드=메인보드;
		this.메모리=메모리;
		this.그래픽카드=그래픽카드;
		this.SSD=SSD;
		this.파워=파워;
	}
	
	public void printInfo() {
		System.out.println("===컴퓨터 사양===");
		System.out.println("cpu : "+cpu);
		System.out.println("메인보드 : "+메인보드);
		System.out.println("메모리 : "+메모리);
		System.out.println("그래픽카드 : "+그래픽카드);
		System.out.println("SSD : "+SSD);
		System.out.println("파워 : "+파워);
	}
}

