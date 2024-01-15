package 실습10차시;

public class CoffeData {
	
	private int 설탕;
	private int 프리마;
	private int 원두;
	private int 물;
	private int 매출금액;
	
	public void setupMachine(int 설탕, int 프리마, int 원두, int 물) {
		this.설탕 = 설탕;
		this.프리마 = 프리마;
		this.원두 = 원두;
		this.물 = 물;
		this.매출금액 = 0;
	}
	
	public void printInfo() {
		System.out.println("---현재 커피 머신 정보---");
		System.out.println(this.물);
		System.out.println(this.설탕);
		System.out.println(this.원두);
		System.out.println(this.프리마);
		System.out.println(this.매출금액);
	}
}
