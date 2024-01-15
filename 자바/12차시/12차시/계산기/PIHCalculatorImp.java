package prjDay11.계산기;
                                        // 인터페이스 상속 (implements 구현하다)
public class PIHCalculatorImp implements Calculator{

	@Override
	public int addAcorn(int num1, int num2) {
		System.out.println("PIH");
		return num1+num2;
	}

	@Override
	public int subAcorn(int num1, int num2) {
		System.out.println("PIH");
		return num1-num2;
	}

	@Override
	public int multiplyAcorn(int num1, int num2) {
		System.out.println("PIH");
		return num1*num2;
	}

	@Override
	public double devideAcorn(int num1, int num2) {
		System.out.println("PIH");
		return num1/(double) num2;
	}

}
