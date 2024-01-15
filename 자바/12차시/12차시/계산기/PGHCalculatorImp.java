package prjDay11.계산기;

public class PGHCalculatorImp implements Calculator {

	@Override
	public int addAcorn(int num1, int num2) {
		System.out.println("pgh 더하기");
		System.out.print(num1 + "+" + num2 + "= ");
		return num1+num2;
	}

	@Override
	public int subAcorn(int num1, int num2) {
		System.out.println("pgh 빼기");
		System.out.print(num1 + "-" + num2 + "= ");
		return num1-num2;
	}

	@Override
	public int multiplyAcorn(int num1, int num2) {
		System.out.println("pgh 곱하기");
		System.out.print(num1 + "*" + num2 + "= ");
		return num1*num2;
	}

	@Override
	public double devideAcorn(int num1, int num2) {
		System.out.println("pgh 나누기");
		System.out.print(num1 + "/" + num2 + "= ");
		return num1/(double)num2;
	}
}