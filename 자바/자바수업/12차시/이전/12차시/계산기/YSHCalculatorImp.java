package prjDay11.계산기;

public class YSHCalculatorImp implements Calculator {

	@Override
	public int addAcorn(int num1, int num2) {
		System.out.println("YSH add");
		return num1 + num2;
	}

	@Override
	public int subAcorn(int num1, int num2) {
		System.out.println("YSH sub");
		return num1 - num2;
	}

	@Override
	public int multiplyAcorn(int num1, int num2) {
		System.out.println("YSH multiply");
		return num1 * num2;
	}

	@Override
	public double devideAcorn(int num1, int num2) {
		System.out.println("YSH devide");
		return (double)num1/(double)num2;
	}
	
}
