package week03.day2.영빈님;

public class 컴퓨터Test {

	public static void main(String[] args) {

		컴퓨터 cumputer = new 컴퓨터();
		
		cumputer.input(
				"이텔 코어19-12세대",
				"MSI PRO H610M-G DDR4",
				"삼성전자 DDR5-4800 (8GB)",
				"MSI 지포스 RTX 3060 게이밍 X D6 12GB 트윈프로져8",
				"삼성전자 포터블 SSD T7 (1TB)",
				"마이크로닉스 COOLMAX VISION II 500W"
				);
		
		cumputer.printInfo();

	}

}
