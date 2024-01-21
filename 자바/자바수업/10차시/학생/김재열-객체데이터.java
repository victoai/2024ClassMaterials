package day10.classType;

public class 객체데이터 {

	private int 한화;
	private int 달러;
	private int 유로;
	private int 엔화;
	private int 위안;
	private int sum;

	public void input(int 한화, int 달러, int 유로, int 엔화, int 위안) {
		this.한화 = 한화;
		this.달러 = 달러;
		this.유로 = 유로;
		this.엔화 = 엔화;
		this.위안 = 위안;
	}

	public void printInfo() {
		System.out.println(한화);
		System.out.println(달러);
		System.out.println(유로);
		System.out.println(엔화);
		System.out.println(위안);
		System.out.println(sum);
	}

}
